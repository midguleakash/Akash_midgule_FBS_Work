package studentmanagement.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import studentmanagement.controller.BatchController;

@WebServlet("/batch/*")
public class BatchServlet extends HttpServlet {
	
	BatchController controller= new BatchController();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		setCors(resp);
		String path = req.getPathInfo();
		if ("/getallbatch".equals(path)) {
			controller.getAllBatch(req, resp);
		}
	}
	
	
	private void setCors(HttpServletResponse resp) {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
	}

}
