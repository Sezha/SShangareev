package ru.job4j.array;

/**
* Class Square. 
* Заполнение массива числами со степенью.
* @author Sergei Shangareev (sezhaekb@gmail.com).
* @version 1.0
*/
public class Square {

	/*
	* Method calculate.
	* @param  bound количество чисел в массиве.
	*/
	public int[] calculate(int bound) {
		//create new array from bound of numbers.
		int[] result = 	new int[bound];
		final int EXPONENT = 2;
			for (int i = 2; i <= bound; i++) {
                result[0] = 1;
                result[i - 1] = (int) Math.pow(i, EXPONENT);
            }
			return result;
	}
}