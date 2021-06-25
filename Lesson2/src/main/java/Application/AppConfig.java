package Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan("Application")
public class AppConfig {

    @Autowired
    private ProductService productService;

}
