import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
public class MySQLExample {

	public static void main(String[] args) {
		
		try {
			//more testing with github
			Properties props = new Properties();
			FileInputStream in = new FileInputStream("db.properties");
			props.load(in);
			
			Connection c = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("username"),
					props.getProperty("password"));
					
					
					//("jdbc:mysql://localhost:3306/classicmodels", "", "mypassword");
			
			Statement s = c.createStatement();
			System.out.println("Connected");
			ResultSet rs = s.executeQuery("select * from customers");
			System.out.println("Selected");
			//rs.next();
			while (rs.next()) {
			
			System.out.println(rs.getInt("CustomerNumber"));
			System.out.println(rs.getString("ContactFirstName"));
			//testas dar vienas testas
			}
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
