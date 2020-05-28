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
    public void ShouldAddTwoNumbers() {
        // Given
        double firstNumber = 1.0;
        double secondNumber = 2.0;
        // When
        double result = this.calculator.add(firstNumber, secondNumber);
        // Then
        Assert.assertEquals("3.0", result);
    }
}
