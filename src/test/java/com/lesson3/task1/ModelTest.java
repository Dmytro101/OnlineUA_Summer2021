package com.lesson3.task1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ModelTest {

    private Model model;

    @Before
    public void init() {
        model = new Model();
        model.setBarriers(0, 100);
    }

    @Test
    public void checkValueWin() {
        model.setRandomSecretNumber();
        assertFalse(model.checkValue(model.getSecretNumber()));
    }

    @Test
    public void checkValueMore() {
        model.setSecretNumber(50);
        assertTrue(model.checkValue(1));
    }

    @Test public void checkValueLess() {
        model.setSecretNumber(50);
        assertTrue(model.checkValue(99));
    }

    @Test
    public void setRandomSecretNumber() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 10_000; i++) {
            model.setRandomSecretNumber();
            set.add(model.getSecretNumber());
        }
        int expected = 99;
        int actual = set.size();
        assertEquals(expected, actual);
    }

    @Test
    public void getAttempts() {
        model.setSecretNumber(77);
        List<Integer> expected = new ArrayList<>(Arrays.asList(50, 75, 87, 79, 77));
        for (Integer i : expected) {
            model.checkValue(i);
        }
        List<Integer> actual = model.getAttempts();
        assertEquals(expected, actual);
    }
}