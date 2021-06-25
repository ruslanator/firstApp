package Application;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component(value = "inMemory")
public class ProductInMemoryRepository implements ProductRepository{
    private List<Product> products;

    @PostConstruct
    public void init(){
        products = new ArrayList<Product>();
        products.add(new Product(293942, "Milk", 2.63));
        products.add(new Product(1111, "Meat", 10.54));
        products.add(new Product(2, "Cheese", 5.6));
    }


    public List<Product> getProduct() {
        return Collections.unmodifiableList(products);
    }
}
