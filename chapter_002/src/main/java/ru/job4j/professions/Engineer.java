package ru.job4j.professions;

/**
* Class Engineer.
* @auhtor Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Engineer extends Profession { 
	public String object;
	public Engineer(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	/*
	* Method buildHome 
	* build Home
	* @return object.
	*/
	public String buildHome(Home home) {
		return object;
	}
}