package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Cts-1982");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from eproduct");
		while (rs.next()) {
			System.out.println(rs.getInt("ID"));
			System.out.println(rs.getString("name"));
		}
	}

}
