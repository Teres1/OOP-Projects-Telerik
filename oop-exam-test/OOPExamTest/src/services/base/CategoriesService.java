package services.base;

import java.util.List;

import models.Category;

public interface CategoriesService {
    List<Category> listAllCategories();

    Category findCategoryById(int id);

    Category getOrCreate(String categoryName);
}
