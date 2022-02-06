package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryEx {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Cts-1982");
		Statement st = con.createStatement();

		st.executeUpdate("insert into eproduct (name, price, date_added) values ('Tablet', '1000.00', now())");
		ResultSet rs = st.executeQuery("select * from eproduct");

		while (rs.next()) {
			System.out.print(rs.getInt("ID"));
			System.out.println(rs.getString("name"));
		}
	}

}
