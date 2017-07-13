package jdbc_test4;

import java.sql.*;

public class ResultSetInsertDemo {
	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.35.160:3306/trainee17", "trainee17",
				"trainee@alac");
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,

		ResultSet.CONCUR_UPDATABLE);

		ResultSet rs = stmt.executeQuery("select * from emp ");

		   rs.moveToInsertRow(); 
		rs.updateString(0, "asha");
		rs.updateString(1,"development");
		rs.insertRow();

		while (rs.next()) {

			System.out.println("name is :"+rs.getString("employee")+"        "  +           "department is:" + rs.getString("dept"));
			

		}
	}
}
