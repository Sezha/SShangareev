package ru.job4j.loop;

/** 
* Подсчет суммы чётных чисел в диапазон
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class Counter { 
	/**
	* 
	* 
	*/
	public int add(int start, int finish) {
		int result = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				//
				 result += i;
			}

		}
		return result;
	}
}