package com.sruthi.dsa.intro;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfNaturalNumbersTest {

    private SumOfNaturalNumbers sumOfNaturalNumbers = new SumOfNaturalNumbers();

    @Test
    public void sum1() {
        Assertions.assertEquals(6, sumOfNaturalNumbers.sum1(3));
        Assertions.assertEquals(55, sumOfNaturalNumbers.sum1(10));
    }

    @Test
    public void sum2() {
        Assertions.assertEquals(6, sumOfNaturalNumbers.sum2(3));
        Assertions.assertEquals(55, sumOfNaturalNumbers.sum2(10));
    }

    @Test
    public void sum3() {
        Assertions.assertEquals(6, sumOfNaturalNumbers.sum3(3));
        Assertions.assertEquals(55, sumOfNaturalNumbers.sum3(10));
    }
}