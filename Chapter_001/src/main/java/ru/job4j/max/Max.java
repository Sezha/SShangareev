package ru.job4j.max;

/**
 * Нахождение максимального числа.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Max {

    /**
     * Method max
     * Поиск максимального из двух чисел.
     * @param first, second Два числа для сравнения.
     * @return Максимальное число.
     */
    public int max(int first, int second) {
    	return first > second ? first : second;
    }

	/**
	 * Method maxThree
     * Поиск максимального из трех чисел.
     * @param first, second, third Три числа для сравнения.
     * @return Максимальное число.
     */
    public int maxThree(int first, int second, int third) {
    	
    	//compare two numbers first and second
    	int temp = this.max(first, second);
    	temp = this.max(temp, third);

    	return temp;

    }
}