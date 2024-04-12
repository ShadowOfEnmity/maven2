package dao;

import entity.Category;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class CategoryDao implements Dao<Category, Long> {
    private final List<Category> categoryStubs = new ArrayList<>();

    {
        categoryStubs.add(new Category(1, "Electronics"));
        categoryStubs.add(new Category(2, "Men's fashion"));
    }

    @Override
    public Optional<Category> findById(Long id) {
        return categoryStubs.stream()
                .filter(category -> id.equals(category.getId()))
                .findFirst();
    }

    @Override
    public List<Category> findAll() {
        return Collections.unmodifiableList(categoryStubs);
    }
}
