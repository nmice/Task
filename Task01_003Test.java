package com.task;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Mike Neginsky on 13.05.2018.
 */
public class Task01_003Test {

    private Task01_003 task

    @Before
    public void init() { task = new Task01_003(); }

    @After
    public void tearDown() { task = null; }

    @Test
    public void todo() {
        assertTrue(main(1) == "You entered a number 1");
    }
}
