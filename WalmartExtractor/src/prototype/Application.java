//Russell Rowell, Robert White, Karan Singh, Kevin Wu
//CSIS 2450
//Web Extractor
import java.sql.*;
public class Application {

	public static void main(String[] args)
	{
		//Connect to Database
		try{
			// 1. Get a connection to database
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webextractor", "username", "password");
			// 2. Create a statment
			Statement myStmt = myConn.createStatement();
			// 3. Execue SQL query
			ResultSet myResult = myStmt.executeQuery("select * from webextractor");
			while (myResult.next()){
				System.out.println(myResult.getString("set_id") + " | "+ myResult.getString("retailer") + " | " + myResult.getString("title") + " | "+ myResult.getString("description") + " | "+ myResult.getString("price"));
			}
		}
		catch (Exception exc){
				exc.printStackTrace();;
		}
		
		
		
		
	}
}
