package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/akash")
public class LoginServlet extends HttpServlet {

	
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	System.out.print("akash");
    	String email = req.getParameter("email");
    	String password = req.getParameter("password");
    	PrintWriter pw = resp.getWriter();
    	
    	if(email.equals("firstbit") && password.equals("password")) {
    		pw.print("login success");
    	}else {
    		pw.print("login fail");
    	}
    }
    
    
}