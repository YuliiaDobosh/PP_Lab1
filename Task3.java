
public class Task3 {
    public static void main(final String[] args) {
        System.out.println(getFactorialrek(10));
        System.out.println(getFactorial(10));

    }
    public static int getFactorialrek(final int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorialrek(f - 1);
        }
    }

    public static int getFactorial(final int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
