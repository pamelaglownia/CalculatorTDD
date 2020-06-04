package pl.glownia.pamela;

import java.util.Scanner;

class Calculator {
    private final Scanner takeData;

    Calculator(Scanner takeData) {
        this.takeData = takeData;
    }

    void calculate() {
        while (true) {
            double firstNumber = this.getNumber();
            Symbol symbol = this.getOperator();
            double secondNumber = symbol == Symbol.DIVIDE ? this.getNumberForDivision() : this.getNumber();
            double result = this.getResult(symbol, firstNumber, secondNumber);
            this.printResult(result);
        }
    }

    double getNumber() {
        System.out.println("Type the number: ");
        while (!takeData.hasNextDouble()) {
            System.out.println("Wrong value. Type the number: ");
            takeData.next();
        }

        return takeData.nextDouble();
    }

    Symbol getOperator() {
        System.out.println("Type the operator: ");
        char sign = takeData.next().charAt(0);
        for (Symbol symbol : Symbol.values()) {
            if (symbol.getSymbol() == sign) {
                return symbol;
            }
        }
        System.out.println("Wrong value.");
        return getOperator();
    }

    double getNumberForDivision() {
        double number = getNumber();
        if (number != 0) {
            return number;
        }
        System.out.println("You can't divide by 0");
        return getNumberForDivision();
    }

    double getResult(Symbol symbol, double firstNumber, double secondNumber) {
        return symbol.compute(firstNumber, secondNumber);
    }

    void printResult(double result) {
        System.out.println("Result = " + result);
    }
}