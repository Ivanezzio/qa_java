package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    private final int kittensCount;
    private final int expected;

    public FelineParameterizedTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensParameters() {
        return new Object[][]{
                {2, 2},
                {6, 6}
        };
    }

    @Test
    public void getKittensParameterizedShouldEquals() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }
}