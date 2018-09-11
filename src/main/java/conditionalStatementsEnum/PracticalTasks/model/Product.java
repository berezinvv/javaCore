package conditionalStatementsEnum.PracticalTasks.model;

public class Product {

    private String name;
    private double price;
    private int quantity;
    static private Product mostExpensive;
    static private Product biggestQuantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

        if (mostExpensive == null|| mostExpensive.price < price){
                mostExpensive = this;
        }

        if (biggestQuantity == null|| biggestQuantity.quantity < quantity){
            biggestQuantity = this;
        }
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public static Product getMostExpensive() {
        return mostExpensive;
    }

    public static Product getBiggestQuantity() {
        return biggestQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
