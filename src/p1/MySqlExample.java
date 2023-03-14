package p1;

import java.sql.*;

public class MySqlExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "admin");
		Statement stmt= con.createStatement();
		String query="select emp.EmpId,emp.deptId as dept, emp.FirstName, emp.LastName , dep.deptId ,dep.deptName from employee emp left join department dep on \r\n"
				+ "emp.deptId=dep.deptId;";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString("dept"));
			System.out.println(rs.getString(3));
		}
		
		//stmt.executeUpdate("INSERT INTO Employee VALUES(5,'aarti','lastname','sanjana@gmail.com','123.123.1834',5000,2)");
		
	}

}
