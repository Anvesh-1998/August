package com.lti.august;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProductServlet
 */
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddProductServlet() {
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    Product p = new Product()
				p.setId(Integer.parseInt(request.getParameter("id")));
				p.setName(request.getParameter("name"));
				p.setPrice(Double.parseDouble(request.getParameter("price")));

				ProductDao dao = new ProductDao();
				dao.insert(p);
				response.getWriter().write("Product added success.  <a href='addProduct.jsp'>Click here</a> to add more");
	}

}
