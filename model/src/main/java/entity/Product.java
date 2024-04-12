package entity;


import entity.Category;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(of = "name")
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id"})
public class Product {
    private long id;
    private String name;
    private double price;

    Category category;
}
