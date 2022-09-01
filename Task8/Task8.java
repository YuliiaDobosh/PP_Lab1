package Task8;

public class Task8 {
    public static void main(String[] args) {
        CustomDouble a = new CustomDouble(1, 0.5);
        CustomDouble b = new CustomDouble(3, 0.7);

        CustomDouble c = a.sum(b);

        System.out.println(c.toString()); // 5.2
        System.out.println(c.getI());//5
        System.out.println(c.getD());//0.2
    }
}
