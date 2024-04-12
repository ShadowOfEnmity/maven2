package utils;

import dto.ProductDto;
import entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    public static ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);


    @Mapping(source = "category", target = "category")
    ProductDto outgoing(Product product);

    @Mapping(target = "id", ignore = true)
    Product incoming(ProductDto product);


}
