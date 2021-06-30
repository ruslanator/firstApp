package Application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ProductService productService = context.getBean("productService", ProductService.class);

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(s.equals("average")){
            System.out.println(productService.calculateAverageCost());
        }
//        if(s.equals("create")){
//            long id = sc.nextLong();
//            String title = sc.nextLine();
//            double cost = Double.parseDouble(sc.nextLine());
//            productService.createNewProduct(id, title, cost);
//        }
        if(s.equals("getProducts")){
            System.out.println(productService.getAllProducts());
        }
//        if(s.equals("deleteProducts")){
//            productService.deleteAllProduct();
//        }
//        if(s.equals("update")){
//            int id = sc.nextInt();
//            long newID = sc.nextLong();
//            String newTitle = sc.nextLine();
//            double newCost = sc.nextDouble();
//            productService.updateProduct(id, newID, newTitle, newCost);
//        }

    }
}
