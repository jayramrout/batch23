package jrout.tutorial.corejava.jdbc;

import java.sql.*;

public class JDBCProgram {
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
    static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";
    
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employees";
		String driverName = "com.mysql.jdbc.Driver";//"com.mysql.jdbc.Driver";		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName(driverName);
			System.out.println("My Driver is loaded...");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,"root","root");
			System.out.println("Connection established...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees.employees e where e.emp_no > 10050");
			while(rs.next()) {
				Employee emp = new Employee();
				emp.fname = rs.getString("first_name");
				/// arraylist.add(emp);
				System.out.println(rs.getString("first_name") +" " + rs.getString("last_name") +" " + rs.getString(5));
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void printDetails(List<Employees> employees){
		
	}
}

class Employee{
	public String fname;
}
