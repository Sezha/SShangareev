package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test Tracker.
 * Test all method of class tracker.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05/01/2018.
 */
public class TrackerTest {

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", 123L);
        tracker.add(item);
        assertThat(tracker.findAll().get(0), is(item));
    }

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        tracker.add(previous);
        Item next = new Item("test2", "testDescription2", 1234L);
        next.setId(previous.getId());
        tracker.replace(previous.getId(), next);
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    @Test
    public void whenDeleteItemByIDThenReturnNewArray() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        tracker.add(third);
        tracker.delete(second.getId());
        List<Item> expect = Arrays.asList(first, third);
        assertThat(tracker.findAll(), is(expect));
    }

    @Test
    public void whenFindAllAndAddFourItemThenReturnAll() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        tracker.add(third);
        Item fourth = new Item("test4", "testDescription4", 123456L);
        tracker.add(fourth);
        List<Item> expect = Arrays.asList(first, second, third, fourth);
        assertThat(tracker.findAll(), is(expect));
    }

    @Test
    public void whenFindByNamefromFiveItemsThenReturnTwoItemsByName() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        tracker.add(third);
        Item fourth = new Item("test4", "testDescription4", 123456L);
        tracker.add(fourth);
        Item fifth = new Item("test3", "testDescription5", 12345L);
        tracker.add(fifth);
        List<Item> expect = Arrays.asList(third, fifth);
        assertThat(tracker.findByName(third.getName()), is(expect));
    }

    @Test
    public void whenFindByIdOfFirstItemThenReturnItemFirst() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        tracker.add(third);
        Item fourth = new Item("test4", "testDescription4", 123456L);
        tracker.add(fourth);
        Item fifth = new Item("test3", "testDescription5", 12345L);
        tracker.add(fifth);
        assertThat(tracker.findById(first.getId()), is(first));
    }
}