package ruslan.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ruslan.springboot.exceptions.ResourceNotFoundException;
import ruslan.springboot.model.Product;
import ruslan.springboot.repositories.ProductRepository;


import java.io.PrintStream;
import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.getProducts();
    }

    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(()
                -> new ResourceNotFoundException("Продукта с данным ID не существует"));
    }


}