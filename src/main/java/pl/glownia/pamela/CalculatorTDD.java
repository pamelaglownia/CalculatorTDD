package pl.glownia.pamela;

import java.util.Scanner;

class CalculatorTDD {

    public static void main(String[] args) {

        Scanner takeData = new Scanner(System.in);
        Calculator calculator = new Calculator(takeData);
        calculator.calculate();
    }
}
