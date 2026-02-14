package com.example;
import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        ProductCRUD app = new ProductCRUD(factory);
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        while (ch != 6) {
            System.out.println("1. Insert Product");
            System.out.println("2. View Product");
            System.out.println("3. View All Products");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();
            if (ch == 1) {
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Description: ");
                String desc = sc.next();
                System.out.print("Enter Category: ");
                String cat = sc.next();
                System.out.print("Enter Quantity: ");
                int qty = sc.nextInt();
                System.out.print("Enter Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter SKU: ");
                String sku = sc.next();
                System.out.print("Active true/false: ");
                boolean active = sc.nextBoolean();
                Product p = new Product(name, desc, cat, qty, price, sku, active);
                app.insertProduct(p);
            }
            else if (ch == 2) {
                System.out.print("Enter Product ID: ");
                Long id = sc.nextLong();
                Product p = app.getProduct(id);
                if (p != null) {
                    System.out.println(p);
                } else {
                    System.out.println("Product not found...");
                }
            }
            else if (ch == 3) {
                app.getAllProducts();
            }
            else if (ch == 4) {
                System.out.print("Enter Product ID: ");
                Long id = sc.nextLong();
                System.out.print("Enter New Price: ");
                double price = sc.nextDouble();
                System.out.print("Enter New Quantity: ");
                int qty = sc.nextInt();
                app.updateProduct(id, price, qty);
            }
            else if (ch == 5) {
                System.out.print("Enter Product ID: ");
                Long id = sc.nextLong();
                app.deleteProduct(id);
            }
            else if (ch == 6) {
                System.out.println("Exit");
            }
            else {
                System.out.println("Wrong choice...");
            }
        }
        sc.close();
        factory.close();
    }
}
