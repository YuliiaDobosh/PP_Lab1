package Task9;

import Task8.CustomDouble;

public class Calculator {
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(final double number) {
        this.number = number;
    }

    public Calculator(final double number) {
        this.number = number;
    }

    public double add(final double number2) {
        if (number2 % 1 == 0) {
            return number + number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        final CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        final CustomDouble c = new CustomDouble(numberInt, numberDouble);

        final CustomDouble sum = cd.sum(c);
        final double d = sum.toDouble();
        return d;
    }

    public double ded(final double number2) {
        if (number2 % 1 == 0) {
            return number - number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        final CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        final CustomDouble c = new CustomDouble(numberInt, numberDouble);

        final CustomDouble ded = cd.ded(c);
        final double d = ded.toDouble();
        return d;
    }

    public double mult(final double number2) {
        if (number2 % 1 == 0) {
            return number * number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        final CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        final CustomDouble c = new CustomDouble(numberInt, numberDouble);

        return cd.toDouble() * c.toDouble();
    }
    public double div(final double number2) {
        if (number2 % 1 == 0) {
            return number / number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        final CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        final CustomDouble c = new CustomDouble(numberInt, numberDouble);

        return cd.toDouble() / c.toDouble();
    }
}

