package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import dao.CityDAO;
import dao.TeamDAO;
import model.City;
import model.Team;

/*
Create a main-class called Main inside the controller package.
Create appropriate objects for the TeamDAO and CityDAO class.
Create appropriate objects for the model classes.
Get the values from main class and pass to the createTeam method to store in the database.
Call the getCityByName method and display the details of the players.
*/

public class Main{
	
	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		TeamDAO teamDAO=new TeamDAO();
		CityDAO cityDAO=new CityDAO();
		City city;
		Team team;
		
		System.out.println("Enter City Id");
		long id=Long.parseLong(br.readLine());
		
		System.out.println("Enter City Name");
		String cityName=br.readLine();
		city=new City(id,cityName);
		
		System.out.println("Enter Team ID");
		int teamid=Integer.parseInt(br.readLine());
		
		System.out.println("Enter Team Name");
		String teamname=br.readLine();
		
		System.out.println("Enter Coach Name");
		String coachname=br.readLine();
		
		System.out.println("Enter Captain Number");
		int captainnumber=Integer.parseInt(br.readLine());
		team=new Team(teamid,teamname,coachname,city,captainnumber);
		
		teamDAO.createTeam(team);
		cityDAO.getCityByName(cityName);
		
		System.out.println("Team Details are:");
		System.out.println("NAME        COACH        CITY");
		System.out.println(team.getName()+"        "+team.getCoach()+"        "+team.getCityName());
	}
}