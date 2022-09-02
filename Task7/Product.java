package Task7;

public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

    public Product(final String name, final double price) {
        this.name = name;
        this.price = price;
    }
}
