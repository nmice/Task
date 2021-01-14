package week100;

import week100.impl.PriceThrottler;
import week100.impl.PriceThrottlerSubscriber;

import java.time.Duration;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ThrottlerAppRunner {
    private static final Duration ALGORITHM_RUNNING_TIME = Duration.ofSeconds(60);
    private static final int NUMBER_OF_CURRENCY_RATE_UPDATES = 20_000;
    private static final List<String> CURRENCY_CODES = Arrays.asList(
            "EUR", "USD", "RUR", "BYN", "CHF", "CAD", "AUD");
    //200(10*20) subscribers with different delays
    public static final List<Integer> SUBSCRIBERS_DELAYS = Arrays.asList(
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,

            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000,
            100, 200, 300, 500, 700, 1_000, 2_000, 5_000, 7_000, 10_000
    );

    /**
     * This sample application runs the Throttler with attached Subscribers
     * that are set to be using various delays
     * n*(n-1) currency pairs are being updated (42 for the default test data)
     * The resulting state of the subscribers will be printed out to the console.
     */
    public static void main(String[] args) throws InterruptedException {
        PriceProcessor priceThrottler = new PriceThrottler();
        List<PriceProcessor> subscribers = createSubscribersWithDelayInMillis(SUBSCRIBERS_DELAYS);
        subscribers.forEach(priceThrottler::subscribe);

        createCurrencyExchangeCodeToRateUpdateMap().forEach(priceThrottler::onPrice);

        Thread.sleep(ALGORITHM_RUNNING_TIME.toMillis());
        subscribers.forEach(priceThrottler::unsubscribe);
        subscribers.forEach(System.out::println);
    }

    private static List<PriceProcessor> createSubscribersWithDelayInMillis(List<Integer> delaysMillis) {
        return delaysMillis.stream()
                .map(delay -> new PriceThrottlerSubscriber(Duration.ofMillis(delay)))
                .collect(Collectors.toList());
    }

    private static Map<String, Double> createCurrencyExchangeCodeToRateUpdateMap() {
        Map<String, Double> result = new LinkedHashMap<>();
        for (String currency1 : CURRENCY_CODES) {
            for (String currency2 : CURRENCY_CODES) {
                for (double rate = 0; rate < NUMBER_OF_CURRENCY_RATE_UPDATES; rate++) {
                    if (!currency1.equals(currency2)) {
                        result.put(currency1 + currency2, rate);
                    }
                }
            }
        }
        return result;
    }
}
