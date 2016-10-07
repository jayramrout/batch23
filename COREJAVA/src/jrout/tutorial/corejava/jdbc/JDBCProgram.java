package jrout.tutorial.corejava.jdbc;

import java.sql.*;

public class JDBCProgram {
	private static String oracleDriver = "oracle.jdbc.driver.OracleDriver";
    static String connectionURL = "jdbc:oracle:thin:@localhost:1521/XE";
    Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:mysql://localhost:3306/employees";
	String driverName = "com.mysql.jdbc.Driver";//"com.mysql.jdbc.Driver";		
	
	public static void main(String[] args) throws SQLException {
		JDBCProgram prog = new JDBCProgram();
		prog.loadDriver();
		prog.getConnection();
//		prog.selectQuery(10005);
//		prog.selectUsingPrepareStatement(10005);
		
//		prog.createTable();
		
//		prog.createProcedureShowEmployees();
		
		prog.insertRowInDBAndRollBack(102, "Jyothi2");
	
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
			con = DriverManager.getConnection(url,"jrout","jrout");
			System.out.println("Connection established...");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void selectQuery(int empId) {
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from employees.employees e where e.emp_no = "+empId);
			while(rs.next()) {
				rs.getString("first_name");
				System.out.println(rs.getString("first_name") +" " + rs.getString("last_name") +" " + rs.getString(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			closeConnections(rs, pstmt, con);
		}
	}
	
	public void selectUsingPrepareStatement(int empId) {
		try {
			pstmt = con.prepareStatement("select * from employees.employees e where e.emp_no = ?");
			pstmt.setInt(1, empId);
//			pstmt.setString(2, "");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				rs.getString("first_name");
				System.out.println(rs.getString("first_name") +" " + rs.getString("last_name") +" " + rs.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeConnections(rs, pstmt, con);
		}
		
	}
	
	public void createTable() {
        try {
            stmt = con.createStatement();
            //CREATE TABLE H2KTable(id number(4) , name VARCHAR2(20)) // This is for Oracle
            boolean hasResults = stmt.execute("CREATE TABLE H2KTable(id int(4) , name VARCHAR(20))");
            System.out.println("Has ResultsSet ..." + hasResults);
            
            System.out.println("Table got created...");
        } catch (SQLException exp) {
            exp.printStackTrace();
        } finally {
            closeConnections(rs, stmt, con);
        }
    }
	
	
	/**
     * API to close all open connections.
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
    
    
    public void insertRowInDBAndRollBack(int id, String name) {
        try {
            con.setAutoCommit(false);

            pstmt = con.prepareStatement("insert into H2KTable values(?,?)");

            pstmt.setInt(1, id);
            pstmt.setString(2, name);

            // pstmt.setInt(1, Integer.parseInt(id+"a"));
            // pstmt.setString(2, name+"1");

            int intValue = pstmt.executeUpdate();
            System.out.println("JDBCProgram.insertRowInDBAndRollBack()"
                    + intValue);

            int i = 4 / 0;

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