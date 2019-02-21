package services.base;

import java.util.List;
import java.util.function.Predicate;

import models.Category;
import models.Product;

public interface ProductsService {
    List<Product> listAllProducts();

    List<Product> search(Predicate<Product> predicate);

    List<Product> getProductsByCategory(Category category);

    void addCategoryToProduct(Product product, Category category);

    Product findById(int id);

    Product createProduct(String productName, double productPrice, List<Category> categories);
}
