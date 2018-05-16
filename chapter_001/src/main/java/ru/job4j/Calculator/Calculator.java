package ru.job4j.calculator;
/**
* Class Calculator
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Calculator {
	/**
	* @param result = result
	*/
	private double result;
	
	/**
	* Method add
	* Метод сложения
	* @param first = first
	* @param second = second
	*/
	public void add(double first, double second) {
		this.result = first + second;
	}

	/**
	* Method subtract
	* Метод вычитания из первого числа второе
	* @param first = first
	* @param second = second
	*/
	public void subtract(double first, double second) {

		this.result = first - second;
	}

	/**
	* Method  div
	* Метод деления первого числа на второе
	* @param first = first
	* @param second = second
	*/
	public void div(double first, double second) {

		this.result = first / second;
	}

	/**
	* Method  multiple	
	* Метод умножения первого числа на второе
	* @param first = first
	* @param second = second
	*/
	public void multiple(double first, double second) {

		this.result = first * second;
	}

/**
	* Method  getResult	
	* Метод вывода результата
	*/
	public double getResult() {

		return this.result;
    }
	
}