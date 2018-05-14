package ru.job4j.professions;

/**
* Class Teacher.
* @auhtor Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Teacher extends Profession { 
	public String subject;
	public Teacher(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	/*
	* Method buildHome 
	* build Home
	* @return object.
	*/
	public String teachStudent(Student student) {
		return subject;
	}

}