package pl.glownia.pamela;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static pl.glownia.pamela.Symbol.*;

public class CalculatorTest {
    private Calculator calculator;
    private Scanner takeData;
    private Symbol symbol;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator(takeData);
    }

    @Test
    public void ShouldAddTwoNumbers() {
        // Given
        double firstNumber = 1;
        double secondNumber = 2;
        // When
        double result = calculator.getResult(PLUS, 1, 2);
        // Then
        Assert.assertEquals(3.0, result, 0.1);
    }

    @Test
    public void ShouldSubtractTwoNumbers() {
        // Given
        double firstNumber = 10;
        double secondNumber = 1;
        // When
        double result = calculator.getResult(MINUS, 10, 1);
        // Then
        Assert.assertEquals(9.0, result, 0.1);
    }

    @Test
    public void ShouldMultiplyTwoNumbers() {
        // Given
        double firstNumber = 2;
        double secondNumber = 2;
        // When
        double result = calculator.getResult(TIMES, 2, 2);
        // Then
        Assert.assertEquals(4.0, result, 0.1);
    }

    @Test
    public void ShouldDivideTwoNUmbers() {
        // Given
        double firstNumber = 6;
        double secondNumber = 2;
        // When
        double result = calculator.getResult(DIVIDE, 6, 2);
        // Then
        Assert.assertEquals(3.0, result, 0.1);
    }

    @Test
    public void ShouldNotAllowToDivideByZero() {
        // Given
        double firstNumber = 6;
        double secondNumber = 0;
        // When
        double result = calculator.getResult(DIVIDE, 6, 0);
        // Then
        // "You can't divide by 0"
    }
}