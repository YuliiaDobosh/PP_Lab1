package Task9;

import Task8.CustomDouble;

public class Task9 {
    public static void main(final String[] args) {
    final Calculator calc = new Calculator(8.6);
    final Calculator calc2 = new Calculator(4.);
        System.out.println(calc.add(calc2.getNumber()));
        System.out.println(calc.ded(calc2.getNumber()));
        System.out.println(calc.mult(calc2.getNumber()));
        System.out.println(calc.div(calc2.getNumber()));
    }
}
