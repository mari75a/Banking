package lk.jiat.ee.bank.servlet;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lk.jiat.ee.bank.ejb.remote.LoginService;

import java.io.IOException;

@WebServlet("/login")
public class Login  extends HttpServlet {

    @EJB
    private LoginService loginService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");

       boolean login= loginService.login(name, password);
       if(login){
           req.getSession().setAttribute("user", name);
           resp.sendRedirect("home.jsp");
       }else{
           resp.sendRedirect("login.jsp");
       }
    }
}
