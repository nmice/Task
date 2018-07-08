package week06;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class TaskG02_03_Fibonacci_cachingTest {

    @Test
    public void getFibonacciFromRecursionCache() {
        BigInteger expected = BigInteger.valueOf(63245986);
        BigInteger actual = TaskG02_03_Fibonacci_caching.getFibonacciFromRecursion(40, null);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getFibonacciFromRecursion() {
        BigInteger expected = BigInteger.valueOf(63245986);
        BigInteger actual = TaskG02_03_Fibonacci_caching.getFibonacciFromRecursion(40);
        Assert.assertEquals(expected, actual);
    }

    @Test(timeout=2000)
    public void getFibonacciFromRecursionCachePerformance() {
        TaskG02_03_Fibonacci_caching.getFibonacciFromRecursion(40);
    }
}