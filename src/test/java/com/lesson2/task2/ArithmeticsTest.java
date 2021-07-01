package com.lesson2.task2;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

public class ArithmeticsTest {

    private static Arithmetics a;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout time = new Timeout(1000);

    @BeforeClass
    public static void init() {
        a = new Arithmetics();
    }

    @Test
    public void add() {
        double actual = a.add(3, 7);
        double expected = 10.0;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void deduct() {
        double actual = a.deduct(10, 7);
        double expected = 3.0;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void mult() {
        double actual = a.mult(2, 3);
        double expected = 6.0;
        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void div() {
        double actual = a.div(10, 2);
        double expected = 5.0;
        assertEquals(expected, actual, 0.1);
    }

//    @Test(expected = ArithmeticException.class)
    @Test
    public void divException() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);
    }

    @Test(timeout = 1000)
    public void runtime() {
        a.div(10.0, 10.0);
    }
}