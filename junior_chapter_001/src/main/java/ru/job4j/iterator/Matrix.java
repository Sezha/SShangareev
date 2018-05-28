package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * class Matrix.
 * class iterator for two-dimensional arrays.
 * @author Sergei Shangareev(sezhaekb2gmail.com).
 * @version 1.0.
 * @since 28/05/2018.
 */
public class Matrix implements Iterator {
    /**
     * row is counter of rows for Iterator.
     */
    private int row = 0;
    /**
     * column is counter of columns for Iterator.
     */
    private int column = 0;
    /**
     * two-dimensional array.
     */
    private final int[][] values;


    public Matrix(final int[][] values) {
        this.values = values;
    }

    @Override
        public boolean hasNext() {
            return this.values.length  >  this.row;
        }

    @Override
    public Object next() {
        int result = this.values[row][column++];
        if (values[row].length == this.column) {
            this.column = 0;
            this.row++;
        }
        return result;
    }
}
