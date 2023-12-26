import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return name;
    }

    public double getProductPrice() {
        return price;
    }

    public int getProductQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class Inventory {
    private List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product newProduct) {
        productList.add(newProduct);
    }

    public List<Product> getAllProducts() {
        return productList;
    }
}

public class InventoryManagementSystem {
    public static void main(String[] p) {
        Inventory productInventory = new Inventory();
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Display Inventory");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = inputScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = inputScanner.next();  
                    System.out.print("Enter product price: "); 
                    double productPrice = inputScanner.nextDouble(); 
                    System.out.print("Enter product quantity: ");
                    int productQuantity = inputScanner.nextInt(); 

                    Product newProduct = new Product(productName, productPrice, productQuantity);
                    productInventory.addProduct(newProduct);

                    System.out.println("Product added successfully!");
                    break;

                case 2:
                    System.out.println("\nCurrent Inventory:");
                    List<Product> products = productInventory.getAllProducts();
                    for (Product product : products) {
                        System.out.println("Name: " + product.getProductName() +
                                ", Price: $" + product.getProductPrice() +
                                ", Quantity: " + product.getProductQuantity());
                    }
                    break;

                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}