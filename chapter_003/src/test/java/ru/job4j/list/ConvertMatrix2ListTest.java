package ru.job4j.list;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * test of class ConvertMatrix2List.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.30.2018.
 */
public class ConvertMatrix2ListTest {
    /**
     * test of method toList.
     */
    @Test
    public void whenTwoOnTwoArrayThenListFour() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
    @Test
    public void whenThreeOnFourArrayThenListFour() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2, 5, 7},
                {3, 4, 4, 3},
                {1, 2, 3, 4, 5},
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 5, 7, 3, 4, 4, 3, 1, 2, 3, 4, 5
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}