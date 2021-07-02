package ruslan.springboot.repositories;

import org.springframework.stereotype.Component;
import ruslan.springboot.model.Product;


import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<Product>();
        products.add(new Product(1L, "Milk", 2.63));
        products.add(new Product(2L, "Meat", 10.54));
        products.add(new Product(3L, "Cheese", 5.6));
    }


    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }


    public Optional<Product> findById(Long id) {
        return products.stream().filter(s -> s.getID().equals(id)).findFirst();
    }
}