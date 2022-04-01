package ViewLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSV {
	public static Connection openConnection() throws Exception {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-VGPD1K6Q\\SQLEXPRESS:1433;databaseName=QL_SV;user=sa;password=nhuan123");
			return conn;
	}
	
	public static void main(String[] args) throws SQLException{
		Connection con = null;
		try {
			con = openConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(con.toString());
		con.close();
	}
}
