public class Task4 {
    public static void main(final String[] args) {
        final int [] mas = new int[101];
        for (int i = 1; i < mas.length; i++){
            //System.out.println(i);
            if(i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else
            if (i % 3 == 0) {
                System.out.println("FIZZ");
            }
            else
            if (i % 5 == 0) {
                System.out.println("BUZZ");
                }
            else
                System.out.println(i);
            }
        }
    }

