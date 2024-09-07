package Homework_7_Classes_Objects_Constructors;

// Create a class named Product with attributes such as the product name, price, category, stock quantity,
// and one attribute to indicate if the product is on sale. Define a method to put the product on sale.
// Include another method to calculate and return a discounted price if the product is on sale,
// applying a 10% discount if the price is greater than $100. If the product is not on sale, return the original price.
// Additionally, create a method that prints the product’s name, category, and either the discounted price or
// the original price, depending on whether the product is on sale.

public class Product {

    String name;
    double price;
    String category;
    int stockQuantity;
    boolean onSale;


    public Product(String name, double price, String category, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.onSale = false;
    }

    public static void main(String[] args) {

        Product product1 = new Product("Lamp", 120.00, "Lightning", 50);
        Product product2 = new Product("Flower pot", 15.50, "Gardening", 50);
        Product product3 = new Product("Compost", 20.39, "Gardening", 20);
        Product product4 = new Product("Garden Chair", 176.00, "Furniture", 48);

        product1.putOnSale();
        product2.putOnSale();
        product4.putOnSale();

        product1.printProductDetails();
        product2.printProductDetails();
        product3.printProductDetails();
        product4.printProductDetails();
    }

    public void putOnSale() {
        this.onSale = true;
    }

    public double calculateDiscountedPrice() {
        if (onSale && price > 100) {
            return price * 0.90;
        }
        return price;
    }


    public void printProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + calculateDiscountedPrice());
        System.out.println();
    }
}
