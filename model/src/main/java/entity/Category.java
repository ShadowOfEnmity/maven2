package entity;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"id"})
public class Category {
    private long id;
    private String name;
}
