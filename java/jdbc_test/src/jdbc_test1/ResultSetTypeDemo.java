package jdbc_test1;

import java.sql.*;

public class ResultSetTypeDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.35.160:3306/trainee17", "trainee17",
				"trainee@alac");
		DatabaseMetaData meta = con.getMetaData();
		if (meta.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {

			System.out.println("type name=TYPE_FORWARD_ONLY");

		}

		if (meta.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {

			System.out.println("type name=TYPE_SCROLL_INSENSITIVE");

		}

		if (meta.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {

			System.out.println("type name=TYPE_SCROLL_SENSITIVE");
		}

	}
}
