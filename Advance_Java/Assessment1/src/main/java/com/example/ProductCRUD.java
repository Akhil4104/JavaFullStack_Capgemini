package com.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import java.util.List;

public class ProductCRUD {
    SessionFactory factory;
    public ProductCRUD(SessionFactory factory) {
        this.factory = factory;
    }
    public void insertProduct(Product product) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
        System.out.println("Product inserted successfully...");
    }
    public Product getProduct(Long id) {
        Session session = factory.openSession();
        Product product = session.get(Product.class, id);
        session.close();
        return product;
    }
    public void getAllProducts() {
        Session session = factory.openSession();
        List<Product> list = session.createQuery("from Product").list();
        for (Product p : list) {
            System.out.println(p);
        }
        session.close();
    }
    public void updateProduct(Long id, double newPrice, int newQty) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) {
            product.setPrice(newPrice);
            product.setQuantity(newQty);
            session.update(product);
            System.out.println("Product updated successfully...");
        } else {
            System.out.println("Product not found...");
        }
        tx.commit();
        session.close();
    }
    public void deleteProduct(Long id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) {
            session.delete(product);
            System.out.println("Product deleted successfully...");
        } else {
            System.out.println("Product not found...");
        }
        tx.commit();
        session.close();
    }
}
