package utils;

import dto.CategoryDto;
import entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    public static CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);


    CategoryDto outgoing(Category category);

    @Mapping(target = "id", ignore = true)
    Category incoming(CategoryDto product);
}
