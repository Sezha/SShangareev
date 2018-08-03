package ru.job4j.generic;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * class SimpleArrayTest.
 * class obertka.
 * @author Sergei Shangareev(sezhaekb@gmail.com).
 * @version 1.0.
 * @since 22/07/2018.
 */
public class SimpleArrayTest {



    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void whenAddTooManyToArrayShouldThrowException() {
        SimpleArray<String> temp = new SimpleArray<>(0);
        temp.add("1");
    }

    @Test
    public void set() {
    }

    @Test
    public void whenDeleteLastOneElementFromThreeThenArrayBecomeSizeOfTwo() {
        SimpleArray<String> temp = new SimpleArray<>(5);
        temp.add("F");
        temp.add("J");
        temp.add("P");
        temp.delete(0);
        assertThat(temp.getSize(), is(2));
    }

    @Test
    public void whenDeleteWrongIndexThenReturnFalse() {
        SimpleArray<String> temp = new SimpleArray<>(1);
        boolean deleteResult = temp.delete(0);
        assertThat(deleteResult, is(false));
    }

    @Test
    public void whenDeleteRightIndexThenReturnTrue() {
        SimpleArray<String> temp = new SimpleArray<>(1);
        temp.add("A");
        boolean deleteResult = temp.delete(0);
        assertThat(deleteResult, is(true));
    }

    @Test
    public void whenSetToEmptyArrayThenReturnFalse() {
        SimpleArray<String> temp = new SimpleArray<>(1);
        boolean setResult = temp.set(1, "1");
        assertThat(setResult, is(false));
    }

    @Test
    public void whenSetTwoRightIndexThenReturnCorrectValue() {
        SimpleArray<String> temp = new SimpleArray<>(1);
        temp.add("1");
        temp.set(0, "2");
        assertThat(temp.get(0), is("2"));
    }

    @Test
    public void whenAddOneElementThenReturnRightSize() {
        SimpleArray<String> temp = new SimpleArray<>(5);
        temp.add("A");
        temp.add("B");
        temp.add("C");
        temp.add("D");
        assertThat(4, is(temp.getSize()));
    }
}