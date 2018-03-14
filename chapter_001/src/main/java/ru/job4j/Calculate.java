package ru.job4j;

/**
* Class Calculate
* 
* @author Sergei Shangareev 
* @version 1.0
*/
public class Calculate {
	
	/**
	* main 
	* Констурктор вывод строки в консоль.
	* @param args - args
	*/
	public static void main(String[] args) {
		System.out.println("Hello World!!");
	}


	/**
	* Method echo 
	* Вывод строки в консоль со словом Echo
	* @param name Your name
	* @return Echo plus Your name
	*/
	public String echo(String name) {
		return "Echo, Echo, Echo : " + name;
	}


}
