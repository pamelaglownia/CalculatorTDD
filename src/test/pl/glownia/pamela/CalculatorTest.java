package pl.glownia.pamela;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class CalculatorTest {
    private Calculator calculator;
    private Scanner takeData;

    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator(takeData);
    }

    @Test
    public void ShouldBeCorrectOperator() {
        // Given
        char operator = '+';
        // When
        Symbol symbol = this.calculator.getOperator();
        // Then
        Assert.assertEquals('+', symbol);
    }

    @Test
    public void ShouldAddTwoNumbers() {
        // Given
        double firstNumber = 1.0;
        double secondNumber = 2.0;
        // When
        double result = this.calculator.add(firstNumber, secondNumber);
        // Then
        Assert.assertEquals(3.0, result, 0.01);
    }

    @Test
    public void ShouldSubtractTwoNumbers() {
        // Given
        double firstNumber = 10.0;
        double secondNumber = 3.0;
        // When
        double result = this.calculator.subtract(firstNumber, secondNumber);
        // Then
        Assert.assertEquals(7.0, result, 0.01);
    }

    @Test
    public void ShouldMultiplyTwoNumbers() {
        // Given
        double firstNumber = 2.0;
        double secondNumber = 3.0;
        // When
        double result = this.calculator.multiply(firstNumber, secondNumber);
        // Then
        Assert.assertEquals(6.0, result, 0.01);
    }

    @Test
    public void ShouldDivideFirstNumberBySecondNumber() {
        // Given
        double firstNumber = 18.0;
        double secondNumber = 2.0;
        // When
        double result = this.calculator.divide(firstNumber, secondNumber);
        // Then
        Assert.assertEquals(9.0, result, 0.01);
    }
}
