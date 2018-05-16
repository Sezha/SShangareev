package ru.job4j.loop;

/** 
* Подсчет суммы чётных чисел в диапазон
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Counter { 
	/**
	* Method add
	* Подсчет суммы чётных чисел
	* @param start, finish Диапазон чисел
	* @return result Cумма четных чисел
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				//Cкладывание четных чисел
				 result += i;
			}

		}
		return result;
	}
}