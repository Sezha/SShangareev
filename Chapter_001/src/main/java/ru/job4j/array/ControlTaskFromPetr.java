package ru.job4j.array;

/**
 * class ControlTaskFromPetr.
 * This  class should sort new array from two equivalent arrays by ascending.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version  1.0
 */
public class ControlTaskFromPetr {

    public int[] sortArray(int[] first, int[] second) {
        int size = first.length + second.length;
        int[] array = new int[size];
        for (int i = 0; i < size/2; i++) {
            if (first[i] > second[i]) {
                array[i + i] = second[i];
                array[i + i + 1] = first[i];
            } else {
                array[i + i] = first[i];
                array[i + i + 1] = second[i];
            }
        }
        for (int index = size-1; index > 0; index--){
            for (int i = 0; i < index; i++) {
                    if (array[i] > array[i + 1]) {
                        int temp = array[i];
                        array[i] = array [i + 1];
                        array[i + 1] = temp;
                    }
            }
        }
        return array;
    }
}
