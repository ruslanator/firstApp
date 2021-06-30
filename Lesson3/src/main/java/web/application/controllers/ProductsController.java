package web.application.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.application.model.Product;
import web.application.services.ProductService;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class ProductsController {
    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService){
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String showAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "all_products";
    }

    @GetMapping("/product/{id}")
    public String showProductByID (@RequestParam Long id, Model model){
        model.addAttribute("product", productService.findProductByID(id));
        return "product_ID";
    }
}
