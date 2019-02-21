package services;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import models.Category;
import models.Product;
import services.base.ProductsService;

public class ProductsServiceImpl implements ProductsService {
    private static List<Product> products;

    static {
        products = new ArrayList<>();
    }

    @Override
    public List<Product> listAllProducts() {
        return products;
    }

    @Override
    public List<Product> search(Predicate<Product> predicate) {
        List<Product> newList = products.stream().filter(predicate).collect(Collectors.toList());
        return newList;
    }

    @Override
    public List<Product> getProductsByCategory(Category category) {
        List<Product> newProducts = new ArrayList<Product>();
        for (Product prod : products) {
            for (Category cat : prod.getCategories()) {
                if (cat.getName().equals(category.getName())) {
                    newProducts.add(prod);
                }
            }
        }
        return newProducts;
    }

    @Override
    public void addCategoryToProduct(Product product, Category category) {
        product.getCategories().add(category);
    }

    @Override
    public Product findById(int id) {
        for (Product prod : products) {
            if (prod.getId() == id) {
                return prod;
            }
        }
        return null;
    }

    @Override
    public Product createProduct(String productName, double productPrice, List<Category> categories) {
        Product newProduct = new Product(productName, productPrice, categories);
        products.add(newProduct);
        return newProduct;
    }

}
