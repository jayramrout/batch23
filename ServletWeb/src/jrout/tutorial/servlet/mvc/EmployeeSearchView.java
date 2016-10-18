package jrout.tutorial.servlet.mvc;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jrout.tutorial.servlet.mvc.Employee;

/**
 * Servlet implementation class EmployeeSearchView
 */
@WebServlet("/EmployeeSearchView")
public class EmployeeSearchView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSearchView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String allEmp = request.getParameter("allEmp");
		if("on".equalsIgnoreCase(allEmp)) {
			List<Employee> empList = (List<Employee>)request.getAttribute("allEmployee");
			out.println("<table>");
			for(Employee emp : empList) {
			
				out.println("<tr><td>" + emp.getEmpNo() +"</td><td>"+ emp.getFirstName()+"</td></tr>");
			}
			out.println("</table>");

		}else {
			Employee emp = (Employee)request.getAttribute("empInfo");
			out.println("Employee Details = EmpId =" + emp.getEmpNo() +" Emp FN "+ emp.getFirstName());	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
