package jrout.tutorial.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/loginServlet"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
    	    super();
    	    System.out.println("This is the constructor...");
    }
    @Override
    public void init() throws ServletException {
    		System.out.println("This is the INIT Method...");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		System.out.println("This is Service Method....");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		/*String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String password = request.getParameter("password");*/
		String email = request.getParameter("email");
		/*if(!email.endsWith("gmail.com")){
//			response.sendRedirect("error.html");
//			response.sendRedirect("LoginErrorServlet?email="+email);
			RequestDispatcher rd = request.getRequestDispatcher("LoginErrorServlet");
			rd.forward(request, response);
			
		}*/
		String password = request.getParameter("password");
		String message = (String)request.getAttribute("test");
		
		out.print("Hello "+email+" Now time is "+ new java.util.Date());
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    		doPost(req, resp);
    }
    
	/*protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is Service Method....");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		out.print("Hello "+email+" Now time is "+ new java.util.Date());
	}*/

}
