package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public double calculateAverageCost(){
        List<Product> products = productRepository.getProduct();
        if(products.size() == 0){
            return 0;
        }
        int average = 0;
        for (Product p : products){
            average += p.getCost();
        }
        average /= products.size();
        return average;
    }

    public void createNewProduct(long id, String title, double cost){
        List<Product> products = productRepository.getProduct();
        Product product = new Product(id, title, cost);
        products.add(product);
    }

    public List<Product> getAllProducts(){
        List<Product> products = productRepository.getProduct();
        return products;
    }

    public void deleteAllProduct(){
        List<Product> products = productRepository.getProduct();
        products.clear();
    }
    public void updateProduct(int id, long newID, String newTitle, double newCost){
        List<Product> products = productRepository.getProduct();
        products.get(id).setID(newID);
        products.get(id).setTitle(newTitle);
        products.get(id).setCost(newCost);
    }



}
