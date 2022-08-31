
public class Task5 {
    public static void main(String[] args) {

        //створення матриці  n x m
        int[][] a = new int[3][4];
        int[][] b = new int[4][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int)(Math.random()*10);
            }
        }
        // вивід початкової матриці
        System.out.println("Початкова матриця");
        for (int i = 0; i < a.length; i++,System.out.println()) {
            for (int j = 0; j < a[i].length  ; j++) {
                System.out.print(a[i][j]+" ");            }
        }
        // транспонування матриці
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = a[j][i];

            }
        }
        //вивід транспонованної матриці
        System.out.println();
        System.out.println("Транспонована матриця");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}




