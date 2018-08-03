package ru.job4j.generic;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * class SimpleArray.
 * class obertka.
 * @author Sergei Shangareev(sezhaekb@gmail.com).
 * @version 1.0.
 * @since 22/07/2018.
 */
public class SimpleArray<T> implements Iterable<T> {
    Object[] array;
    int arraySize = 0;
    int position = 0;

    /**
     * Constructor of class SimpleArray.
     * @param size input size of array.
     */
    public SimpleArray(int size) {
        array = new Object[size];
        this.arraySize = size;
    }

    /**
     * method add.
     * @param value
     * @return
     */
    public void add(T value) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            array[position++] = value;
        }
    }

    /**
     * method set.
     * @param index index of position.
     * @param value T value.
     * @return
     */
    public boolean set(int index, T value) {
       boolean result = false;
            if (index >= 0 && index < position) {
                array[index] = value;
                result = true;
            }
            return result;
    }

    /**
     * method delete.
     * @param index index of position.
     * @return boolean of result..
     */
    public boolean delete(int index) {
            boolean result = false;
            if (index >= 0 && index < position) {
                System.arraycopy(array, index + 1, array, index, array.length - 1 - index);
                position--;
                result = true;
            }
            return result;
        }

    /**
     * method get.
     * @param index index of position.
     * @return element of array.
     */
     public T get(int index) {
            if (!(index >= 0 && index < position)) {
                throw new ArrayIndexOutOfBoundsException();
            }
            return (T) array[index];
     }

     @Override
     public Iterator<T> iterator() {
            return new SimpleArrayIterator(array, arraySize);
     }

     @Override
     public String toString() {
            String result = "[";
            for (Object element : array) {
                if (element == null) {
                    result += "null, ";
                } else {
                    result += element.toString() + ", ";
                }

            }
            if (arraySize > 0) {
                result = result.substring(0, result.length() - 2);
            }
            result += "]";
            return result;
     }

//      public String getRealToString () {
//            String result = "[";
//            return result;
//        }

    /**
     * method getSize.
     * @return size of array.
     */
     public int getSize() {
            return position;
     }

    /**
     * method isFull.
     * @return boolean of fullness of array.
     */
     private boolean isFull() {
            return (position == arraySize) ? true : false;
     }

    /**
     * class SimpleArrayIterator.
     */
    private class SimpleArrayIterator implements Iterator<T> {

            private Object[] array;
            private int arraySize;
            private int position = 0;

            public SimpleArrayIterator(final Object[] array, int position) {
                this.array = array;
                this.arraySize = position;
            }

            @Override
            public boolean hasNext() {
                return (position < arraySize) ? true : false;
            }

            @Override
            public T next() {
                Object result = null;
                if (hasNext()) {
                    result = array[position++];
                } else {
                    throw new NoSuchElementException();
                }
                return (T) result;
            }

    }
}




