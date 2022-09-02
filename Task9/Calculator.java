package Task9;

import Task8.CustomDouble;

public class Calculator {
    private double number;

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public Calculator(double number) {
        this.number = number;
    }

    public double add(double number2) {
        if (number2 % 1 == 0) {
            return number + number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        CustomDouble c = new CustomDouble(numberInt, numberDouble);

        CustomDouble sum = cd.sum(c);
        double d = sum.toDouble();
        return d;
    }

    public double ded(double number2) {
        if (number2 % 1 == 0) {
            return number - number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        CustomDouble c = new CustomDouble(numberInt, numberDouble);

        CustomDouble ded = cd.ded(c);
        double d = ded.toDouble();
        return d;
    }

    public double mult(double number2) {
        if (number2 % 1 == 0) {
            return number * number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        CustomDouble c = new CustomDouble(numberInt, numberDouble);

        return cd.toDouble() * c.toDouble();
    }
    public double div(double number2) {
        if (number2 % 1 == 0) {
            return number / number2;
        }
        final int numberI = (int) number;
        final double numberD = number - numberI;
        CustomDouble cd = new CustomDouble(numberI, numberD);

        final int numberInt = (int) number2;
        final double numberDouble = number2 - numberInt;
        CustomDouble c = new CustomDouble(numberInt, numberDouble);

        return cd.toDouble() / c.toDouble();
    }
}

