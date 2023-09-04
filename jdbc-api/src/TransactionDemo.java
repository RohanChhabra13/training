import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {
	public static void main(String[] args) {
		String sql1 = "insert into customer values (143, 'Lovina', 'Games')";
		String sql2 = "update customer set domain='Sports' where cust_id=121";
		String sql3 = "delete from customer where cust_id=0";
		Connection conn = null;
		
		
		try {
			conn = JdbcFactory.getConnection();
			
			Statement stmt = conn.createStatement();
			//adding batch of sql queries to statement
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			conn.setAutoCommit(false);
			stmt.executeBatch();
			conn.commit();
			System.out.println("Transaction Completed !");
		} catch (SQLException e) {
			System.out.println("Transaction Failed ! due to....");
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("Rollbacked !");
			}
			catch(SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
