package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.Team;
import utility.ConnectionManager;

/*
Create a dao-class called as TeamDAO to insert user into the database,
public void createTeam(Team team) - Method used to insert new team into the database.
*/

public class TeamDAO{
	Connection con;
	public void createTeam(Team team) throws ClassNotFoundException, IOException, SQLException {
		con=ConnectionManager.getConnection();
		Statement statement=con.createStatement();
		statement.executeUpdate("INSERT INTO team VALUES("+team.getId()+",'"+team.getName()+"','"+team.getCoach()+"',"+team.getCityId()+","+team.getCaptain()+")");
		System.out.println("Team Created");
	}
}