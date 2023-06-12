package com.sparta.springprepare.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    // JUnit은 테스트 환경을 따로 만들고 있다.
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "+", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "/", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test3() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "-", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(6, result);
    }

    @Test
    @DisplayName("곱하기 테스트")
    void test4() {
        Calculator calculator = new Calculator();
        Double result = calculator.operate(8, "*", 2);
        System.out.println("result = " + result);

        Assertions.assertEquals(16, result);
    }
}