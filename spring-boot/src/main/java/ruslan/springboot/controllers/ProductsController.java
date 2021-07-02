package ruslan.springboot.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ruslan.springboot.model.Product;
import ruslan.springboot.services.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductsController {

    private final ProductService productService;

    @GetMapping
    public String showAllProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "all_products";
    }

    @GetMapping("/item")
    @ResponseBody
    public Product getByID(@RequestParam Long id){
        return productService.findById(id);
    }

}

