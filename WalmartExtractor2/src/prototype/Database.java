package prototype;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	
	public static Connection getConnection()throws Exception{
		try{
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/webextractor";
			String username = "root";
			String password = "persius1979";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
			}catch(Exception e){System.out.println(e);}
		return null;
	}
	
	public static void getData()
	{
	//Connect to Database
			try{
				// 1. Create a statment
				Connection myConn = getConnection();
				Statement myStmt = myConn.createStatement();
				// 2. Execue SQL query
				ResultSet myResult = myStmt.executeQuery("select * from webextractor");
				while (myResult.next()){
					System.out.println(myResult.getString("id") + " | "+ myResult.getString("tld") + " | " + myResult.getString("retailer") + " | "+ myResult.getString("title") + " | "+ myResult.getString("description")+" | "+ myResult.getString("price"));
				}
			}
			catch (Exception exc){
					exc.printStackTrace();
			}
	}
	
	public static void insertData() throws Exception{
		
		Product testing = new Product(null, null, null, null, null, null);

		try{
			Connection myConn = getConnection();
			PreparedStatement posted = myConn.prepareStatement("INSERT INTO webextractor (id, tld, retailer, title, description, price) VALUES ('"+testing.getId()+"','"+testing.getTld()+"','"+testing.getRetailer()+"','"+testing.getTitle()+"','"+testing.getDescription()+"', '"+testing.getPrice()+"')");
			
			posted.executeUpdate();
			}catch(Exception e){System.out.println(e);}
		
			finally{
				System.out.println("Insert Completerd");
		}
	}
	
}
