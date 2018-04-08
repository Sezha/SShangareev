package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test of class ControlTaskFromPetr
 * This test class should check new array from two equivalent arrays by ascending.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version  1.0
 */
public class ControlTaskFromPetrTest {

    @Test
    public void setArrayOneWithThreeAndArrayTwoWithFore() {
        ControlTaskFromPetr  testArray = new ControlTaskFromPetr();
        int [] firstArray = {1, 3, 10, 25};
        int[] secondArray = {2, 4, 8};
        int[] result = testArray.sortArray(firstArray, secondArray);
        int [] expected = {1, 2, 3, 4, 8, 10, 25};
        assertThat(result, is(expected));
    }
}