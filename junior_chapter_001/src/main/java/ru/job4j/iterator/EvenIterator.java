package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * class EvenIterator.
 * class iterator for even numbers.
 * @author Sergei Shangareev(sezhaekb2gmail.com).
 * @version 1.0.
 * @since 28/05/2018.
 */
public class EvenIterator implements Iterator {
    /**
     * array of random numbers.
     */
    private int[] array;
    /**
     * counter of elements of array.
     */
    private int index = 0;

    /**
     * constructor of class EvenIterator.
     * @param array array of random numbers.
     */
    public EvenIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        boolean result = false;
        for (int i = index; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                index = i;
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No any even element!");
        }
        return array[index++];
    }
}
