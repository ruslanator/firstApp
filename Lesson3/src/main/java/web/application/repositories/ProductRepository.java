package web.application.repositories;

import org.springframework.stereotype.Component;
import web.application.model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<Product>();
        products.add(new Product(293942, "Milk", 2.63));
        products.add(new Product(1111, "Meat", 10.54));
        products.add(new Product(2, "Cheese", 5.6));
    }


    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public Product getProductById(Long id) {
        for (Product s : products) {
            if (s.getID().equals(id)) {
                return s;
            }
        }
        throw new RuntimeException("Product not found");
    }
}