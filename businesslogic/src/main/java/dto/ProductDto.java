package dto;


import entity.Category;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class ProductDto {
    private String name;
    private double price;

    private CategoryDto category;

}
