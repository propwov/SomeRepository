import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
public class InserteExample {

	public static void main(String[] args) {
		
		try {
			
			Properties props = new Properties();
			FileInputStream in = new FileInputStream("db.properties");
			props.load(in);
			
			Connection c = DriverManager.getConnection(
					props.getProperty("url"),
					props.getProperty("username"),
					props.getProperty("password"));
					
					
					//("jdbc:mysql://localhost:3306/classicmodels", "", "mypassword");
			
			String sql = "insert into employees "  + "values(1000, ?, ?, ?, ?, 1, null, ? )"; 
			
			String lastName = "Peterson";
			String firstName = "John";
			String extension = "x0002";
			String email = "john@mail.com";
			String jobTitle = "producer";
			PreparedStatement s = c.prepareStatement(sql);
			s.setString(1, lastName);
			s.setString(2, firstName);
			s.setString(3, extension);
			s.setString(4, email);
			s.setString(5, jobTitle);
				s.executeUpdate();
			//Statement s = c.createStatement();
			System.out.println("Connected");
			System.out.println("Selected");
			//testas vienas
			
			System.out.print("test"));
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
