package dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString(of = "name")
@AllArgsConstructor
public class CategoryDto {
    private String name;
}