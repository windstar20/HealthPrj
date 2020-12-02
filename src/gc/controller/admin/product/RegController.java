package gc.controller.admin.product;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gc.product.entity.Product;
import gc.product.service.ProductListService;

@WebServlet("/admin/product/reg")
public class RegController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if(request.getMethod().equals("GET"))
			request.getRequestDispatcher("reg.jsp").forward(request, response);
		else if(request.getMethod().equals("POST")) {
		String select = request.getParameter("auto");
		
			
		Product product = new Product(/*변수값 쓰기*/ );
		
		ProductListService service= new ProductListService();
		service.insert(product);
		
		response.sendRedirect("reg");
		
		}
	}
}
