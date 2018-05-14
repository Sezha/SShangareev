package ru.job4j.professions;

/**
* Class Doctor.
* @auhtor Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Doctor extends Profession { 
	public String diagnosis;
	public Doctor(String name, String profession) {
		this.name = name;
		this.profession = profession;
	}
	/*
	* Method treatPatient 
	* treat patient
	* @return diagnosis.
	*/
	public String treatPatient(Patient patient) {
		return diagnosis;
	}
}