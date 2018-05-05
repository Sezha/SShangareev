package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class ConvertList2Array.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05.05.2018.
 */
public class ConvertList2Array {
    /**
     * method toArray.
     * @param list of integers.
     * @param rows amount of rows.
     * @return converted two-dimensional array.
     */
    public int[][] toArray(List<Integer> list, int rows) {
        Integer[] temp = new Integer[list.size()];
        temp = list.toArray(temp);
        int index = 0;
        int cells = (int) Math.ceil((double)list.size() / rows);
        int[][] array = new int[rows][cells];
        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < cells; k++) {
                if (index < temp.length) {
                    array[i][k] = temp[index];
                    index++;
                } else {
                    array[i][k] = 0;
                }
            }
        }
        return array;
    }

    /**
     * method convert.
     * @param list list of array of integers.
     * @return list of integers.
     */
    public List<Integer> convert(List<int[]> list) {
        List<Integer> listNext = new ArrayList<Integer>();
        for (int[] array : list) {
            for (int element : array) {
                listNext.add(element);
            }
        }
        return listNext;
    }
}

