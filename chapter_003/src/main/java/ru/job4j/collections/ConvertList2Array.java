package ru.job4j.collections;

import java.util.List;

/**
 * class ConvertList2Array.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.29.2018.
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
        int cells = 0;
        int index = 0;

        if (temp.length % rows == 0) {
                cells = temp.length / rows;
        } else if (temp.length % rows > 0) {
                cells = temp.length / rows + 1;
        } else if (rows == 0) {
                System.out.println("Error. Please enter valid rows");
        }
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
}

