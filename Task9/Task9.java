package Task9;

import Task8.CustomDouble;

public class Task9 {
    public static void main(final String[] args) {
        final CustomDouble number1 = new CustomDouble(3, 6);
        final CustomDouble number2 = new CustomDouble(2, 4);
        System.out.println(Calculator.mult(number1, number2));
        System.out.println(Calculator.div(number1, number2));
    }
}
