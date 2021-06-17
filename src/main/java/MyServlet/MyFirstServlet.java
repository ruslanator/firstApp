package MyServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MyServlet", urlPatterns = "/products.html")
public class MyFirstServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(MyFirstServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: GET");
        Product apple = new Product(1, "apple", 2.5);
        Product orange = new Product(2, "orange", 10.2);
        Product banana = new Product(3, "banana", 1.2);
        Product kiwi = new Product(44, "kiwi", 11.1);
        Product strawberry = new Product(191, "strawberry", 7);



        resp.getWriter().printf(apple.toString());
        resp.getWriter().printf(strawberry.toString());
        resp.getWriter().printf(orange.toString());
        resp.getWriter().printf(kiwi.toString());
        resp.getWriter().printf(banana.toString());

    }
}