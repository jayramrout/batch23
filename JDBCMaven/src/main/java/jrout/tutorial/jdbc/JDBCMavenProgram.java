package jrout.tutorial.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JDBCMavenProgram {
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:mysql://localhost:3306/employees";
	String driverName = "com.mysql.jdbc.Driver";//"com.mysql.jdbc.Driver";	
	
	public static void main(String[] args) {
		JDBCMavenProgram prog = new JDBCMavenProgram();
		prog.loadDriver();
		prog.getConnection();
		prog.selectAndInsert();

	}
	public void loadDriver() {
		try {
			Class.forName(driverName);
			System.out.println("My Driver is loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void getConnection(){
		try {
			if(con == null) {
				con = DriverManager.getConnection(url,"jrout","jrout");
				System.out.println("Connection established...");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void selectAndInsert(){
		List<Employee> empList = selectQuery();
		List<Employee> h2kEmpList = filterH2kEmployee(empList);
		insertIntoH2kTable(h2kEmpList);
	}
	
	public void insertIntoH2kTable(List<Employee> empList){
		for(Employee emp : empList) {
			insertH2kEmployee(emp.getEmpId(), emp.getFirstName());
		}
	}
	public List<Employee> filterH2kEmployee(List<Employee> empList) {
		List<Employee> h2kEmpList = new ArrayList();
		for(Employee emp : empList){
			if(emp.getFirstName().startsWith("A")) {
				h2kEmpList.add(emp);
			}
		}
		return h2kEmpList;
		
	}
	
	
	
	/**
	 * 
	 * @param empId
	 * @return
	 */
	public List<Employee> selectQuery() {
		List<Employee> empList = new ArrayList();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees.employees e");
			Employee emp = null;
			while(rs.next()) {
				emp = new Employee();
				emp.setEmpId(rs.getInt(1));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnections(rs, pstmt, con);
		}
		return empList;
	}
	
	/**
	 * 
	 * @param rs
	 * @param stmt
	 * @param con
	 */
	private void closeConnections(ResultSet rs, Statement stmt, Connection con) {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception exp) {
            exp.printStackTrace();
        }
    }
	
	/**
	 * 
	 * @param id
	 * @param name
	 */
	public void insertH2kEmployee(int id, String name) {
        try {
        		con = DriverManager.getConnection(url,"jrout","jrout");
			System.out.println("Connection established...");
			
            con.setAutoCommit(false);

            pstmt = con.prepareStatement("insert into H2KTable values(?,?)");

            pstmt.setInt(1, id);
            pstmt.setString(2, name);

            // pstmt.setInt(1, Integer.parseInt(id+"a"));
            // pstmt.setString(2, name+"1");

            int intValue = pstmt.executeUpdate();
            System.out.println("JDBCProgram.insertRowInDBAndRollBack()"
                    + intValue);

            con.commit();
        } catch (Exception exp) {
            exp.printStackTrace();
            try {
                con.rollback();
            } catch (Exception exp1) {
                exp1.printStackTrace();
            }
        } finally {
            closeConnections(rs, stmt, con);
        }
    }
}


/**
 * POJO: Plain Old Java Object
 * @author jrout
 *
 */
class Employee {
	private int empId;
	private String firstName;
	private String lastName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
