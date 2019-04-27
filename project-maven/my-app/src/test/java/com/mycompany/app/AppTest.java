package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void addNumbersTest() {
        App app = new App();
        assertTrue(4 == app.addNumbers(2, 2));
    }

    @Test
    public void substractNumbersTest() {
        App app = new App();
        assertTrue(2 == app.substractNumbers(4, 2));
    }
}
