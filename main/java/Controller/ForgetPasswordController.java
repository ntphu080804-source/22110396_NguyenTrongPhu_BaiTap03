package Controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import  model.user;
import  service.UserService;
import  service.UserServiceImpl;
import java.io.IOException;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/forget")
public class ForgetPasswordController extends HttpServlet{
	 @Override
	    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	        req.getRequestDispatcher("/views/forget.jsp").forward(req, resp);
	    }

	    @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	            throws ServletException, IOException {
	        String username = req.getParameter("username");
	        UserService service = new UserServiceImpl();
	        user user = service.get(username);

	        if (user != null) {
	            req.setAttribute("password", user.getPassWord());
	        } else {
	            req.setAttribute("alert", "Không tìm thấy tài khoản!");
	        }
	        req.getRequestDispatcher("forget.jsp").forward(req, resp);
	    }
}
