package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.City;
import utility.ConnectionManager;

/*
Create a dao-class called as CityDA0 with below methods
public City getCityByName(String name)
 - Method to fetch the city information from database based on the city name.
*/

public class CityDAO{
	//ConnectionManager cm=new ConnectionManager();
	Connection con;
	
	public City getCityByName(String name) throws ClassNotFoundException, IOException, SQLException {
		con=ConnectionManager.getConnection();
		Statement statement=con.createStatement();
		ResultSet rs=statement.executeQuery("SELECT * FROM city");
		while(rs.next()) {
			if(rs.getString("name").equals(name)) {
				System.out.println(rs.getInt("id"));
			}
		}
		return null;
	}
}