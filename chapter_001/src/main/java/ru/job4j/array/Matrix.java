package ru.job4j.array;

/**
 * class Matrix.
 *  Двухмерный массив. Таблица умножения.
 * @author Sergei Shangareev(sezhaekb@gmail.com)
 * @version 1.0
 */

public class Matrix {

    /**
     * Method multiple.
     * Умножение.
     * @param size
     * @return Two-dimensional array
     */
    public int[][] multiple(int size) {
       int[][] arrayMatrix = new int[size][size];


        for (int row = 1; row < size; row++) {
            for (int column = 1; column < size; column++) {
                arrayMatrix[row][column] = row  * column;
            }
        }
        return arrayMatrix;
    }
}
