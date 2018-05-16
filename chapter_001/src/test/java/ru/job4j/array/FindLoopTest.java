package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * TEST class FindLoop.
 * Тест Классического поиска перебором.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0
 */
public class FindLoopTest {
    @Test
    public void findSeventeenFromArrayOfNumbers() {
        FindLoop testarray = new FindLoop();
        int[] numbers = {0, 1, 17, 468, 17, 809};
        int result = testarray.indexOfElement(numbers, 17);
        assertThat(result, is(2));
    }

    @Test
    public void noFindSeventeenFromArrayOfNumbers() {
        FindLoop testarray = new FindLoop();
        int[] numbers = {0, 1, 2334, 468, 555, 809};
        int result = testarray.indexOfElement(numbers, 17);
        assertThat(result, is(-1));
    }

}
