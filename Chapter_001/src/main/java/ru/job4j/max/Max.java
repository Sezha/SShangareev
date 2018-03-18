package ru.job4j.max;

/**
 * Нахождение максимального числа.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Max {

    /**
     * Поиск из двух чисел.
     * @param first, second Два числа для сравнения.
     * @return Максимальное число.
     */
    public int max(int first, int second) {
    	return first > second ? first : second;
    }
}