	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.SQLException;
import java.util.Scanner;

	public class ConsolePreparedStatementDemo {
		public static void main(String[] args) {
			// ? is known as place holders, their index starts from 1
			try {
				String sql = "insert into customer values(?,?,?)";
				
				Connection conn = JdbcFactory.getConnection();
				//Pre-compile statement created with query
				PreparedStatement stmt = conn.prepareStatement(sql);
				//Replacing place holders with values
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter 3 args");
				// Using scanner class
				stmt.setInt(1, sc.nextInt());
				stmt.setString(2, sc.next());
				stmt.setString(3, sc.next());
				stmt.executeUpdate();
				System.out.println("Record Successfully inserted...");
			} 
			catch (SQLException e) {
				System.out.println("Record not inserted, due to...");
				e.printStackTrace();
			}
		}
	}

