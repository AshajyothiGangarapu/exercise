package jdbc_test2;

import java.sql.*;

public class RsMetaDataMethods {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://192.168.35.160:3306/trainee17", "trainee17",
				"trainee@alac");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		ResultSetMetaData rsmd = rs.getMetaData();
		int numberOfColumns = rsmd.getColumnCount();

		for (int i = 1; i <= numberOfColumns; i++) {

		String colName = rsmd.getColumnName(i);

		String tableName = rsmd.getTableName(i);

		String name = rsmd.getColumnTypeName(i);

		boolean caseSen = rsmd.isCaseSensitive(i);

		boolean writable = rsmd.isWritable(i);

		System.out.println("Information for column " + colName);

		System.out.println(" Column is in table " + tableName);

		System.out.println(" DBMS name for type is " + name);

		System.out.println(" Is case sensitive: "+ caseSen);

		System.out.println(" Is possibly writable: " + writable);

		System.out.println("");

		}
	}
}
