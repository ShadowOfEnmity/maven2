package service;

import dao.ProductDao;
import dto.CategoryDto;
import dto.ProductDto;
import utils.CategoryMapper;
import utils.ProductMapper;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private final ProductDao productDao = new ProductDao();
    public List<ProductDto> getAllCategories(){
        return new ArrayList<>(productDao.findAll().stream().map(ProductMapper.INSTANCE::outgoing).toList());
    }

    public ProductDto getCategoryById(long id) throws Exception {
        return productDao.findById(id).map(ProductMapper.INSTANCE::outgoing).orElseThrow(() -> new Exception("No products found"));
    }
}
