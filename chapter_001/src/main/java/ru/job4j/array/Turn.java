package ru.job4j.array;

/**
 * class Turn Перевертывание массива
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Turn {

    /**
     * Method back
     * @param array
     * @return back array
     */
    public int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            //temporary variable
                int temp = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = temp;
        }
        return array;
    }
}
