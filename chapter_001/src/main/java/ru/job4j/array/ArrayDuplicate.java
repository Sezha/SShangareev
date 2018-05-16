package ru.job4j.array;
import java.util.Arrays;

/**
 * class ArrayDuplicate.
 * Удаление дубликатов в массиве.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0
 */
public class ArrayDuplicate {

    /**
     * Method remove
     * Удаляет дубликаты
     * @param array
     * @return
     */
    public String[] remove(String[] array) {
        //length of array.
        int sizeOfArray = array.length;
        //out circle.
        for (int out = 0; out < sizeOfArray; out++) {
            //in circle.
            for (int in = out + 1; in < sizeOfArray; in++) {

                if (array[out].equals(array[in])) {
                    //change index of item of array.
                    array[in] = array[sizeOfArray - 1];
                    //reduce length of array.
                    sizeOfArray--;
                    // reduce count in for cutting array with duplicated items.
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, sizeOfArray);
    }

}
