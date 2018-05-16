package ru.job4j.loop;

/** 
* Программа вычисляющая факториал
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Factorial { 
	/**
	* Method calc
	* Вычисление факториала
	* @param number число для вычесления
	* @return result факториал
	*/
	public int calc(int number) {

		int result = 1;
		if (number == 0) {
			return result;
		} else {

			for (int i = 1; i <= number; i++) {
					//умножение чисел
					 result *= i;
			}
			return result;
		}
	}
}