package model;

/*
Create a class called as Team inside the model package with below attributes,
name - String
coach - String
city - City
Include getter and setter method for all the attributes
Include a constructor with below arguments,
public Team(String name, String coach, String captain, City city)
 */


public class Team{
	int id;
	String name;
	String coach;
	City city;
	int captain;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public City getCity() {
		return city;
	}
	public long getCityId() {
		return city.getCityld();
	}
	public String getCityName() {
		return city.getCityName();
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getCaptain() {
		return captain;
	}
	public void setCaptain(int captain) {
		this.captain = captain;
	}
	
	public Team(int id, String name, String coach, City city, int captain) {
		this.id = id;
		this.name = name;
		this.coach = coach;
		this.city = city;
		this.captain = captain;
	}
	
}