import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class ConnectionDemo {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/training";
		
		DriverManager.registerDriver(new Driver());
		Connection conn = JdbcFactory.getConnection();
		System.out.println("Conncetion Successful !");
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println("DB Name: "+meta.getDatabaseProductName());
		System.out.println("DB Version: "+meta.getDatabaseProductVersion());
		System.out.println("Driver Name: "+meta.getDriverName());
		System.out.println("Driver Version: "+meta.getDriverVersion());
	}
}
