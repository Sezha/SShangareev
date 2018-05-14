package ru.job4j.professions;

/**
* Class Profession.
* @auhtor Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Profession {
	public String name;
	public String profession;
	public Profession() {
	}

	public Profession(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	/*
	* Method getName 
	* return name
	* @return name
	*/
	public String getName() {
		return this.name;
	}
	/*
	* Method getProfession 
	* return profession
	* @return Profession
	*/
	public String getProfession() {
		return this.profession;
	}	
}