package pl.glownia.pamela;

import java.util.Scanner;

class Calculator {
    private final Scanner takeData;

    Calculator(Scanner takeData) {
        this.takeData = takeData;
    }


    double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    double divide(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}

