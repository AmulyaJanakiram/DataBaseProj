package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteQueryEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Cts-1982");
		Statement st = con.createStatement();

		st.executeUpdate(" delete from eproduct where Id = 12;");
		ResultSet rs = st.executeQuery("select * from eproduct");

		while (rs.next()) {
			System.out.print(rs.getInt("ID"));
			System.out.print(rs.getString("name"));
			System.out.println(rs.getDouble("price"));
		}
	}

}