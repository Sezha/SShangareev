package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;


/**
 * class StartUITest.
 * test of class StartUI.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0.
 */
public class StartUITest {
    /**
     * test of method createItem.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
        }
    /**
     * test of method editItem.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item());
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    /**
     * test of method showAll.
     */
    @Test
    public void whenAddThreeItemsThenShowAllItems() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item());
        Input input = new StubInput(new String[]{"1", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * test of method deleteItem.
     */
    @Test
    public void whenUserDeleteItemThenTrackerDeletes() {
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item());
        Item item2 = tracker.add(new Item());
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getId(), is(item2.getId()));
    }
}
