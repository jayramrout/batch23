package jrout.tutorial.servlet.mvc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeSearchServletController
 */
@WebServlet("/EmployeeSearchServletController")
public class EmployeeSearchServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSearchServletController() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = null;
		List<Employee> employeeList = new ArrayList<>();
		EmployeeDAO dao = new EmployeeDAO();
		String empId = request.getParameter("empId");
		String allEmp = request.getParameter("allEmp");
		
		
		try {
			if("on".equalsIgnoreCase(allEmp)) {
				employeeList = dao.getAllEmployeeInfo();
			}else {
				emp = dao.getEmployeeInfo(Integer.parseInt(empId));	
			}
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.setAttribute("empInfo", emp);
		request.setAttribute("allEmployee", employeeList);
//		System.out.println(" employeeList : "+employeeList.size());
		RequestDispatcher  rd = request.getRequestDispatcher("employeeSearchView.jsp");//Servlet:EmployeeSearchView
		rd.forward(request, response);
	}

}
