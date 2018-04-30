package ru.job4j.list;

import java.util.List;
import java.util.ArrayList;
/**
 * class ConvertMatrix2List.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.30.2018.
 */
public class ConvertMatrix2List {
    /**
     * method toList
     * @param array array of integers.
     * @return list of integers
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] rowsArray : array) {
            for (int itemArray : rowsArray) {
                list.add(itemArray);
            }
        }
        return  list;
    }
}
