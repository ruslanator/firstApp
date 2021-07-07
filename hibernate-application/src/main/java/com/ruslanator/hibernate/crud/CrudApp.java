package com.ruslanator.hibernate.crud;

import com.ruslanator.hibernate.PrepareDataApp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudApp {
    private static SessionFactory factory;

    public static void init() {
        PrepareDataApp.forcePrepareData();
        factory = new Configuration()
                .configure("configs/crud/hibernate.cfg.xml")
                .buildSessionFactory();
    }

    public static void shutdown() {
        factory.close();
    }

    public static void createProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product coconut = new Product("Coconut", 300);
            session.saveOrUpdate(coconut);
            session.getTransaction().commit();
            System.out.println(coconut);
        }
    }

    public static void readProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, 3L);
            session.getTransaction().commit();
            System.out.println(product);
        }
    }

    public static void updateProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, 5L);
            System.out.println(product);
            session.evict(product);
            product.setCost(9999);
            session.getTransaction().commit();
            System.out.println(product);
        }
    }

    public static void deleteProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product product = session.get(Product.class, 2L);
            session.delete(product);
            session.getTransaction().commit();
        }
    }

    public static void main(String[] args) {
        try {
            init();
            System.out.println("----- Create product -----");
            createProduct();
            System.out.println("----- Read product -----");
            readProduct();
            System.out.println("----- Update product -----");
            updateProduct();
            System.out.println("----- Delete product -----");
            deleteProduct();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            shutdown();
        }
    }
}
