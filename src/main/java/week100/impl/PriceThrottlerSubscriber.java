package week100.impl;

import week100.PriceProcessor;

import java.time.Duration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;


public class PriceThrottlerSubscriber implements PriceProcessor {
    private static final AtomicInteger counter = new AtomicInteger(0);
    private final Duration delay;
    private final Map<String, Double> receivedUpdates;
    private final int id;

    public PriceThrottlerSubscriber(Duration delay) {
        this.delay = delay;
        this.receivedUpdates = new ConcurrentHashMap<>(); //for demonstration purposes only
        this.id = counter.incrementAndGet();
    }

    @Override
    public void onPrice(String ccyPair, double rate) {
        try {
            Thread.sleep(delay.toMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Updating " + delay + " with " + ccyPair + rate);
        receivedUpdates.put(ccyPair, rate);
    }

    @Override
    public void subscribe(PriceProcessor priceProcessor) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void unsubscribe(PriceProcessor priceProcessor) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "id=" + id +
                "\t|delay=\t" + delay +
                "\t| updates=" + receivedUpdates.size() +
                "\t|" + receivedUpdates;
    }
}
