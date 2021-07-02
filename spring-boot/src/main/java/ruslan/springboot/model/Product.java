package ruslan.springboot.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long ID;
    private String title;
    private double cost;

    @Override
    public String toString() {
        return "ID: " + ID + ", title: " + title + ", cost = " + cost + "\n";
    }
}