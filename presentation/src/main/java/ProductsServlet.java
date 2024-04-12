import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CategoryService;
import service.ProductService;

import java.io.IOException;

@WebServlet("/products")
public class ProductsServlet extends HttpServlet {
    private final ProductService service = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("products", service.getAllCategories().toArray());
        var requestDispatcher = req.getRequestDispatcher("/products.jsp");
        requestDispatcher.forward(req, resp);
    }
}
