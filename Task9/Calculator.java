package Task9;

import Task8.CustomDouble;

public class Calculator {

    public static double add(final CustomDouble number1, final CustomDouble number2) {

        return number1.toDouble() + number2.toDouble();
    }

    public static double deduction(final CustomDouble number1, final CustomDouble number2) {
        return number1.toDouble() - number2.toDouble();
    }

    public static double mult(final CustomDouble number1, final CustomDouble number2) {
        return number1.toDouble() * number2.toDouble();

    }

    public static double div(final CustomDouble number1, final CustomDouble number2) {

        if (number2.toDouble() == 0.0) {
            System.out.println("Error");
            return -1;
        }
        return number1.toDouble() / number2.toDouble();

    }
}

