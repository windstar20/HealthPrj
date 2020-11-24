package controller.admin.product;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gc.entity.Product;
import gc.service.ProductListService;


@WebServlet("/admin/product/list")
public class ListController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int size = 1;
		String size_ = request.getParameter("size");
		
		if(request.getParameter("size")!=null)
			size = Integer.parseInt(size_);
		
		
		PrintWriter out = response.getWriter();  // 

		ProductListService service = new ProductListService();
		List<Product> list = service.getList();
		
		String html = "<table border='1'>";
		for (int i = 0; i < size; i++) {
			Product p = list.get(i);			
			
			html += "<tr>";
			html += "<td>"+(i+1)+"</td><td>"+p.getId() + "</td><td>" + p.getName()+"</td><td>"+p.getId() + "</td><td>" +p.getCode()+ "</td><td>"+p.getPrice() + "</td><td>" + p.getStock()+"</td>";
			html += "</tr>";
		}
		
		html +="</table>";
		out.println(html);
			
	 
		
	}
}
