package week100.impl;

import week100.PriceProcessor;
import javafx.util.Pair;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class EventPublisher {
    private static final int TERMINATION_TIMEOUT_SECONDS = 60;

    private final ExecutorService executorService;
    private final PriceProcessor subscriber;
    private final Map<String, Pair<Double, Instant>> actualToRateAndTimeMap;
    private final Map<String, Instant> sentRateAndTime;

    public EventPublisher(PriceProcessor subscriber, Map<String, Pair<Double, Instant>> ccyToRateAndTime) {
        this.subscriber = subscriber;
        this.actualToRateAndTimeMap = ccyToRateAndTime;
        this.sentRateAndTime = new HashMap<>();
        this.executorService = Executors.newSingleThreadScheduledExecutor();
    }

    public void submitUpdate(String ccyPair) {
        executorService.submit(() -> {
            Pair<Double, Instant> actualRateAndTimeForCcy = actualToRateAndTimeMap.get(ccyPair);
            //checking messages history to make sure we do not send the same message twice(or more)
            if (isMessageHasBeenAlreadySent(ccyPair, actualRateAndTimeForCcy)) {
                return;
            }
            subscriber.onPrice(ccyPair, actualRateAndTimeForCcy.getKey());
            sentRateAndTime.put(ccyPair, actualRateAndTimeForCcy.getValue());
        });
    }

    public void close() {
        executorService.shutdownNow();
        try {
            executorService.awaitTermination(TERMINATION_TIMEOUT_SECONDS, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private boolean isMessageHasBeenAlreadySent(String ccyPair, Pair<Double, Instant> actualRateAndTimePair) {
        return sentRateAndTime.get(ccyPair) != null &&
                !actualRateAndTimePair.getValue().isAfter(sentRateAndTime.get(ccyPair));
    }
}
