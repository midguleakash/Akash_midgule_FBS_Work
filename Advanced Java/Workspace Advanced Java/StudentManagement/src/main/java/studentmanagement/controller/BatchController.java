package studentmanagement.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import studentmanagement.model.Batch;
import studentmanagement.service.BatchService;

public class BatchController {
	
	BatchService batchService = new BatchService();
	ObjectMapper objectMapper = new ObjectMapper();

	public void getAllBatch(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();

		List<Batch> bacthList = batchService.getAllBatch();

		String studentJson = objectMapper.writeValueAsString(bacthList);
		PrintWriter pw = resp.getWriter();

		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
		resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
		resp.setContentType("application/json");
		pw.write(studentJson);

	}

}
