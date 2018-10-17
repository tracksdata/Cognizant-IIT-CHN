package com.product.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.model.Product;
import com.product.service.ProductService;
import com.product.service.ProductServiceImpl;

public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductService prodService = null;
		RequestDispatcher rd = null;
		String option = request.getParameter("menu");

		if (option.equals("add")) {
			String url=null;
			prodService = new ProductServiceImpl();

			Product product = new Product();
			product.setId(request.getParameter("id"));
			product.setName(request.getParameter("name"));
			product.setDescription(request.getParameter("description"));
			product.setPrice(Double.parseDouble(request.getParameter("price")));

			boolean status=prodService.saveProduct(product);
			if(!status) {
			url="AddProduct.jsp?msg=Product Id Already exists.Product is Not Added";	
			}else {
				url="AddProduct.jsp?msg=Product Added Successfully";
			}
			
			List<Product> products = prodService.listAll();
			request.setAttribute("products", products);
			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
			
			

		}

		if (option.equals("list")) {

			prodService = new ProductServiceImpl();
			List<Product> products = prodService.listAll();
			String url = null;
			if (products != null) {
				request.setAttribute("products", products);
				url = "Display.jsp";
			} else {
				url = "Display.jsp?msg=No records to display";
			}

			rd = request.getRequestDispatcher(url);
			rd.forward(request, response);
		}

		if (option.equals("find")) {

			String url=null;
			String id=request.getParameter("id");
			String status=request.getParameter("operation");

			
			prodService=new ProductServiceImpl();
			Product product=prodService.findProduct(id);
			
			if(status.equals("delete")) {
				url="Delete.jsp";
				prodService=new ProductServiceImpl();
				List<Product> prods=prodService.listAll();
				request.setAttribute("prods", prods);
				
				
			}
			
			if(status.equals("search") && product!=null) {
				url="Product.jsp";
				request.setAttribute("product", product);
			}
			
			if(status.equals("update") && product!=null) {
				request.setAttribute("product", product);
				url="Update.jsp";
			}else if(product==null && !(status.equals("delete"))){
				url="FindProduct.jsp?msg=Product Id "+id+" Not Found";
			}
			System.out.println("URL: "+url);
			rd=request.getRequestDispatcher(url);
			rd.forward(request, response);
			
		}

		if (option.equals("update")) {

			//boolean status=Boolean.parseBoolean(request.getParameter("update"));
			
			Product product = new Product();
			product.setId(request.getParameter("id"));
			product.setName(request.getParameter("name"));
			product.setDescription(request.getParameter("description"));
			product.setPrice(Double.parseDouble(request.getParameter("price")));
			
			prodService=new ProductServiceImpl();
			prodService.updateProduct(product);
			rd=request.getRequestDispatcher("FindProduct.jsp?msg=Product Updated");
			rd.forward(request, response);	
			
		}
		
		if(option.equals("delete")) {
			String id=request.getParameter("id");
			prodService=new ProductServiceImpl();
			boolean status=prodService.deleteProduct(id);
			
			rd=request.getRequestDispatcher("ProductController?menu=list");
			rd.forward(request, response);
			
		}

	}

}
