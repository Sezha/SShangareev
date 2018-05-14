package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test of BubbleSort.
 * Тест сортировки массива методом перестановки.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class BubbleSortTest {

    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleArray = new BubbleSort();
        int[] temp = {5, 1, 2, 7, 3};
        int[] result = bubbleArray.sort(temp);
        int[] expected = {1, 2, 3, 5, 7};
        assertThat(result, is(expected));
    }
}
