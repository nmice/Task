package week100.impl;

import week100.PriceProcessor;
import javafx.util.Pair;

import java.time.Instant;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PriceThrottler implements PriceProcessor {
    public static final int MAX_SUBSCRIBERS_CAPACITY = 200;

    private final Map<String, Pair<Double, Instant>> ccyToRateAndTime;
    private final Map<PriceProcessor, EventPublisher> subscriberToPublisher;

    public PriceThrottler() {
        this.subscriberToPublisher = new ConcurrentHashMap<>(MAX_SUBSCRIBERS_CAPACITY);
        this.ccyToRateAndTime = new ConcurrentHashMap<>();
    }

    @Override
    public void onPrice(String ccyPair, double rate) {
        ccyToRateAndTime.put(ccyPair, new Pair<>(rate, Instant.now()));
        this.subscriberToPublisher.values()
                .parallelStream()
                .forEach(eventPublisher -> eventPublisher.submitUpdate(ccyPair));
    }

    @Override
    public void subscribe(PriceProcessor priceProcessor) {
        subscriberToPublisher.put(priceProcessor, new EventPublisher(priceProcessor, ccyToRateAndTime));
    }

    @Override
    public void unsubscribe(PriceProcessor priceProcessor) {
        EventPublisher eventPublisher = subscriberToPublisher.get(priceProcessor);
        eventPublisher.close();
        subscriberToPublisher.remove(priceProcessor);
    }
}
