package service;

import dao.CategoryDao;
import dto.CategoryDto;
import utils.CategoryMapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CategoryService {

    private final CategoryDao categoryDao = new CategoryDao();
    public List<CategoryDto> getAllCategories(){
        return new ArrayList<>(categoryDao.findAll().stream().map(CategoryMapper.INSTANCE::outgoing).toList());
    }

    public CategoryDto getCategoryById(long id) throws Exception {
        return categoryDao.findById(id).map(CategoryMapper.INSTANCE::outgoing).orElseThrow(() -> new Exception("No category found"));
    }
}
