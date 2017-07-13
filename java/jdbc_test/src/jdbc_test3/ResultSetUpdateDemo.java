package jdbc_test3;

import java.sql.*;

public class ResultSetUpdateDemo {
	public static void main(String[] args){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.35.160:3306/trainee17", "trainee17",
				"trainee@alac");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,

ResultSet.CONCUR_UPDATABLE);
		
		
		
		ResultSet rs = stmt.executeQuery("select dept from emp where employee='miller'");
		rs.next();
		String s = rs.getString("dept");
		
		System.out.println(s);
		System.out.println(rs.first());
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}