package Task7;

public class Task7 {
    public static void main(String[] args) {
        Product product;
        double summa =0;
        for (int i =0 ; i <bill.length ; i++){
            product = bill[i].getProduct();
            System.out.println(product.getName() + " " + product.getPrice()+ " "+ bill[i].getCount());
            summa += product.getPrice()*bill[i].getCount();
        }
        System.out.println("The Sum of the bill = " + summa);
    }

    static Pair []bill = new Pair[]{
            new Pair(new Product("banana" , 50.5), 1),
            new Pair(new Product("tomato" , 80.5), 3),
            new Pair(new Product("potato" , 20.0), 2)
    };
}
