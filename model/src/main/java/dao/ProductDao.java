package dao;

import entity.Category;
import entity.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class ProductDao implements Dao<Product, Long> {

    private final List<Product> productStubs = new ArrayList<>();

    {
        productStubs.add(new Product(1, "computer mouse", 3.5,
                new Category(1, "Electronics")
        ));
        productStubs.add(new Product(2, "shirt", 7.0,
                new Category(2, "Men's fashion")
        ));
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productStubs.stream()
                .filter(product -> id.equals(product.getId()))
                .findFirst();
    }

    @Override
    public List<Product> findAll() {
        return Collections.unmodifiableList(productStubs);
    }
}
