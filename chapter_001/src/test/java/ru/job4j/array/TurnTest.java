package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test of Turn Тест перевертывания массива
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class TurnTest {
    @Test
    public void turnEvenArray() {
        Turn evenArray = new Turn();
        int[] testArray = {4, 1, 6, 2};
        int[] resultArray = evenArray.back(testArray);
        int[] expectArray = {2, 6, 1, 4};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void turnOddArray() {
        Turn evenArray = new Turn();
        int[] testArray = {1, 2, 7, 0, 5};
        int[] resultArray = evenArray.back(testArray);
        int[] expectArray = {5, 0, 7, 2, 1};
        assertThat(resultArray, is(expectArray));
    }
}
