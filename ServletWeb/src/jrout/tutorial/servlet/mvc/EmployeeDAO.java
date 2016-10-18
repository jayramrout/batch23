package jrout.tutorial.servlet.mvc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;

public class EmployeeDAO {
//	private static Logger log = Logger.getLogger(EmployeeDAO.class);
	static Connection con = null;
	static Statement stmt =null;
	static PreparedStatement pstmt = null;
	CallableStatement cs = null;
	ResultSet rs = null;
	private static String driver = "com.mysql.jdbc.Driver";
	static String connectionURL = "jdbc:mysql://localhost:3306/employees";
	
	private void loadDriver() throws ClassNotFoundException{
		try{
			Class.forName(driver);
		}catch(ClassNotFoundException exp){
			exp.printStackTrace();
			System.out.println("Issues in Class Not Found"+ exp.getMessage());
			throw exp;
		}
	}
	
	private Connection getConnection(){
		try{
			con = DriverManager.getConnection(connectionURL,"root","root");
		}catch(Exception exp){
			exp.printStackTrace();
		}
		return con;
	}
	
	public Employee getEmployeeInfo(int empId) throws Exception{
		Employee emp = null;
		try{
			loadDriver();
			con = getConnection();
			
			con.setAutoCommit(false);

			pstmt = con	.prepareStatement("Select emp_no , first_name , last_name , gender from employees where emp_no = ?");

			pstmt.setInt(1, empId);
			
			int intValue = 0;
			rs = pstmt.executeQuery();
			while(rs.next()){
				emp = new Employee();
				emp.setEmpNo(empId+"");
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setGender(rs.getString(4));
			}
		}catch(ClassNotFoundException cnfe){
			throw cnfe;
		}catch(Exception exp){
			exp.printStackTrace();
			try{
				if(con != null){
					con.rollback();	
				}
			}catch(Exception exp1){
				throw exp1;
			}
			throw exp;
		}finally{
			closeConnections(rs,stmt,con);
		}
		return emp;
	}
	
	public List<Employee> getAllEmployeeInfo() throws Exception{
		List<Employee> employeeList = new ArrayList<>();
		Employee emp = null;
		try{
			loadDriver();
			con = getConnection();
			
			con.setAutoCommit(false);

			pstmt = con	.prepareStatement("Select emp_no , first_name , last_name , gender from employees LIMIT  100");
			
			int intValue = 0;
			rs = pstmt.executeQuery();
			while(rs.next()){
				emp = new Employee();
				emp.setEmpNo(rs.getString(1));
				emp.setFirstName(rs.getString(2));
				emp.setLastName(rs.getString(3));
				emp.setGender(rs.getString(4));
				employeeList.add(emp);
			}
		}catch(ClassNotFoundException cnfe){
			throw cnfe;
		}catch(Exception exp){
			exp.printStackTrace();
			try{
				if(con != null){
					con.rollback();	
				}
			}catch(Exception exp1){
				throw exp1;
			}
			throw exp;
		}finally{
			closeConnections(rs,stmt,con);
		}
		return employeeList;
	}
	public void insertStudentInfo(String fname, String lname) throws Exception , ClassNotFoundException{
		try{
			loadDriver();
			con = getConnection();
			
			con.setAutoCommit(false);

			pstmt = con.prepareStatement("insert into students(s_id,firstname,lastname) values(STUDENT_SEQUENCE.nextval,?,?)");

			pstmt.setString(1, fname);
			pstmt.setString(2, lname);
			int intValue = 0;
			intValue = pstmt.executeUpdate();

			System.out.println("Return value from insert "+ intValue);
		}catch(ClassNotFoundException cnfe){
			throw cnfe;
		}catch(Exception exp){
			exp.printStackTrace();
			try{
				if(con != null){
					con.rollback();	
				}
			}catch(Exception exp1){
				throw exp1;
			}
			throw exp;
		}finally{
			closeConnections(rs,stmt,con);
		}
	}
	private void closeConnections(ResultSet rs , Statement stmt , Connection con){
		try{
			if(rs != null){
				rs.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
}
