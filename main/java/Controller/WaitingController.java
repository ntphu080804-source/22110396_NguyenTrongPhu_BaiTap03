package Controller;

import model.user;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
@WebServlet(urlPatterns="/Waiting")
public class WaitingController extends HttpServlet{
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session= req.getSession();
        if(session != null && session.getAttribute("account") != null) {
            user u=(user) session.getAttribute("account");
            if(u.getRoleid()==1) {
                resp.sendRedirect("home/admin.jsp");
            } else {
                resp.sendRedirect("home.jsp");
            }
        } else {
            resp.sendRedirect("login");
        }
    }
}
