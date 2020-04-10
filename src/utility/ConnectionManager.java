package utility;

import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Properties;

/*
1.Create a class called as ConnectionManager inside the utility package.
2.Create a method public static Connection getConnection() which returns a connection object.
3.Use the method public static Properties loadPropertiesFile()
  to load the jdbc properties from the jdbc.properties file.
 */

public class ConnectionManager{
	
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
		//Properties prop=loadPropertiesFile();
		
		//Class.forName(prop.getProperty("driver"));
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","Prc123");
		//con=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("username"),prop.getProperty("password"));
		if(con!=null)
			return con;
		else
			return null;
	}
	
//	public static Properties loadPropertiesFile() throws IOException {
//		Properties properties=new Properties();
//		InputStream in=ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
//		properties.load(in);
//		in.close();
//		return properties;
//	}
	
}