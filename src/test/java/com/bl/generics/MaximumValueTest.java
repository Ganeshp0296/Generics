package com.bl.generics;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumValueTest {
    MaximumValue max = new MaximumValue();

    @Test
    public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtFirstPosition() {
        int value = max.findMax(9, 5, 6);
        Assertions.assertEquals(9, value);
    }

    @Test
    public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtSecondPosition() {
        int value = max.findMax(5, 9, 6);
        Assertions.assertEquals(9, value);
    }

    @Test
    public void givenThreeNumberWhenIntegerNumberShouldReturnMaxAtThirdPosition() {
        int value = max.findMax(6, 5, 9);
        Assertions.assertEquals(9, value);
    }
}