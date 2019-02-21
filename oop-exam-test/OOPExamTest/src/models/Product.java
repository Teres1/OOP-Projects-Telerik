package models;

import java.util.List;

public class Product {
    private static int counter = 0;

    private String name;
    private double price;
    private int id;
    private List<Category> categories;

    public Product(String name, double price, List<Category> cat) {
        setCounter(++counter);
        setId(getCounter());
        setName(name);
        setPrice(price);
        setCategories(cat);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }
}
