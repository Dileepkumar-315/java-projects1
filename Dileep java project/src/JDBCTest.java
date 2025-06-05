import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		try {
			//1.load the JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.connect to the database
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb","root","7013");
			
			//3.Insert multiple students
			String insertSQL = "REPLACE INTO students VALUES (?, ?)";
			PreparedStatement pstmt = con.prepareStatement(insertSQL);
			
			//Inserting 6 students (1 existing + 5 new)
			Object[][] students = {
					{1, "Muttu"},
					{2, "ele"},
					{3, "babi"},
					{4, "siri"},
					{5, "krish"},
					{6, "Nithin"}
					};
			for (Object[] student : students) {
				pstmt.setInt(1, (int) student[0]);
				pstmt.setString(2, (String) student[1]);
				pstmt.executeUpdate();
			}
			
			
			//4.Read and display data
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM students");
			
			System.out.println("Student List:");
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			//5.close connection
			con.close();
		}
			catch(Exception e) {
				e.printStackTrace();
			}
}
}
