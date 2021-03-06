package ru.job4j.array;

/**
 * class BubbleSort.
 * Сортировка массива методом перестановки.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0
 */
public class BubbleSort {
    /**
     * Method sort
     * @param array array
     * @return sorted array
     */
    public int[] sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
