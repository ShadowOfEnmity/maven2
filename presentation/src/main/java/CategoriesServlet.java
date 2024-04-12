import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CategoryService;

import java.io.IOException;

@WebServlet("/categories")
public class CategoriesServlet extends HttpServlet {

    private final CategoryService service = new CategoryService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("categories", service.getAllCategories().toArray());
        var requestDispatcher = req.getRequestDispatcher("/categories.jsp");
        requestDispatcher.forward(req, resp);
    }
}
