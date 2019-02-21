package services;

import java.util.ArrayList;
import java.util.List;

import models.Category;
import services.base.CategoriesService;

public class CategoryServiceImpl implements CategoriesService {

    private static List<Category> categories;

    static {
        categories = new ArrayList<>();
    }

    @Override
    public List<Category> listAllCategories() {
        return categories;
    }

    @Override
    public Category findCategoryById(int id) {
        for (Category cat : categories) {
            if (cat.getId() == id) {
                return cat;
            }
        }
        throw new IllegalArgumentException("Invalid ID");
    }

    @Override
    public Category getOrCreate(String categoryName) {
        for (Category cat : categories) {
            if (cat.getName().equals(categoryName)) {
                return cat;
            }
        }
        // otherwise create new cat
        Category newCategory = new Category(categoryName, categories.size());
        return newCategory;
    }
}
