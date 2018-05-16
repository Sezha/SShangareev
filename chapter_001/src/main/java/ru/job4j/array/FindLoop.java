package ru.job4j.array;

/**
 * class FindLoop.
 * Классический поиск перебором.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0
 */
public class FindLoop {

    /**
     * Method indexOfElement
     * @param data array
     * @param element wanted number
     * @return index
     */
    public int indexOfElement(int[] data, int element) {

        int result = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == element) {
                result = index;
                break;
            }
        }
        return result;
    }
}
