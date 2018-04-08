package ru.job4j.array;

/**
 * class ControlTaskFromPetr.
 * This  class should sort new array from two equivalent arrays by ascending.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version  1.0
 */
public class ControlTaskFromPetr {
    /**
     * Method sortArray
     * @param first array
     * @param second array
     * @return sorted array
     */
    public int[] sortArray(int[] first, int[] second) {
        int size = first.length + second.length;
        int[] result = new int[size];
        for (int i = 0, p = 0; i < result.length; i++, p++) {
            if (i == first.length) {
                p = 0;
            }
            if (i < first.length) {
                result[i] = first[p];
            } else {
                result[i] = second[p];
            }
        }
        for (int index = size-1; index > 0; index--){
            for (int i = 0; i < index; i++) {
                    if (result[i] > result[i + 1]) {
                        int temp = result[i];
                        result[i] = result [i + 1];
                        result[i + 1] = temp;
                    }
            }
        }
        return result;
    }
}
