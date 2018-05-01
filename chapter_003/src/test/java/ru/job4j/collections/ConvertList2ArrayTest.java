package ru.job4j.collections;

import org.junit.Test;
import ru.job4j.list.ConvertMatrix2List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * test of class ConvertList2Array.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.30.2018.
 */
public class ConvertList2ArrayTest {
    @Test
    public void whenSevenElementsThenThreeThreeArray() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenSevenElementsThenTwoThreeArray() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                2
        );
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 6, 7, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenTenElementsThenTwoFiveArray() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9),
                2
        );
        int[][] expect = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void whenSixElementsThenOneSixArray() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(0, 1, 2, 3, 4, 5),
                1
        );
        int[][] expect = {
                {0, 1, 2, 3, 4, 5}
        };
        assertThat(result, is(expect));
    }

    /**
     * test of method convert.
     */
    @Test
    public void whenTwoArraysWithThreeAndFiveIntegersThenListEight() {
        ConvertList2Array listTwo = new ConvertList2Array();
        List<int[]> list = new ArrayList<>();
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{5, 0, 2, 4, 3});
        List<Integer> result = listTwo.convert(list);
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 5, 0, 2, 4, 3
        );
        assertThat(result, is(expect));
    }
}