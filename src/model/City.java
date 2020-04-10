package model;

/*
Create a class called as City inside the model package with below attributes,
cityld - Long
cityName - String
Include getter and setter method for all the attributes,
Include a constructor with below arguments,
public City(cityld,cityName)
*/

public class City{
	long cityld;
	String cityName;
	
	public long getCityld() {
		return cityld;
	}
	public void setCityld(long cityld) {
		this.cityld = cityld;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	public City(long cityld, String cityName) {
		this.cityld = cityld;
		this.cityName = cityName;
	}
}