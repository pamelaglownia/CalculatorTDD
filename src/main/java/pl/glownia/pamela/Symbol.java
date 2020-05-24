package pl.glownia.pamela;

enum Symbol {
    PLUS('+') {
        @Override
        double compute(double firstNumber, double secondNumber) {
            return firstNumber + secondNumber;
        }
    },

    MINUS('-') {
        @Override
        double compute(double firstNumber, double secondNumber) {
            return firstNumber - secondNumber;
        }
    },

    TIMES('*') {
        @Override
        double compute(double firstNumber, double secondNumber) {
            return firstNumber * secondNumber;
        }
    },

    DIVIDE('/') {
        @Override
        double compute(double firstNumber, double secondNumber) {
            return firstNumber / secondNumber;
        }
    };

    final char symbol;

    Symbol(char symbol) {
        this.symbol = symbol;
    }

    char getSymbol() {
        return symbol;
    }

    abstract double compute(double firstNumber, double secondNumber);
}


