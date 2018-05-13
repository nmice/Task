package com.task;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Mike Neginsky on 13.05.2018.
 */
public class Task02_013Test {

    private Task02_013 task

    @Before
    public void init() { task = new Task02_013(); }

    @After
    public void tearDown() { task = null; }

    @org.junit.Test
    public void main() {
        assertTrue(main(213) == "312");
    }
}
