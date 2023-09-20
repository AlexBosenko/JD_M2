package org.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void setSumCalculator() {
        this.sumCalculator = new SumCalculator();
    }
    @Test
    public void sumFrom1Equals1Test() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void sumFrom3Equals6Test() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void zeroCheckTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}