package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/HelloWorld","/hw"})
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HelloWorld() {
    	    super();
    	    System.out.println("This is the constructor...");
    }
    @Override
    public void init() throws ServletException {
    		System.out.println("This is the INIT Method...");
    }
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is Service Method....");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("Hello World  Date Now is "+ new java.util.Date());
		
		out.print("<form>First name:<br>"
				+ "<input type=\"text\" name=\"firstname\"><br>"
				+ "Last name:<br><input type=\"text\" name=\"lastname\">"
				+ "</form>");
	}
	
	@Override
	public void destroy() {
		System.out.println("This is destroy method.");
	}

}
