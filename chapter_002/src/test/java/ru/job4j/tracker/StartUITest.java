package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * class StartUITest.
 * test of class StartUI.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 2.3.
 */
public class StartUITest {
    private final Tracker tracker = new Tracker();
    private final Item item = tracker.add(new Item());
    @Before
    public void loadOutput() {
        System.out.println("execute before method");
    }
    @After
    public void backOutput() {
        System.out.println("execute after method");
    }
    /**
     * test of method createItem.
     */
    @Test
    public void whenUserAddTwoItemsThenInTrackerPutThirdItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription1", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Input input = new StubInput(new String[]{"0", "test3", "desc3", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(2).getDescription(), is("desc3"));
        }
    /**
     * test of method editItem.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Input input = new StubInput(new String[]{"2", first.getId(), "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test name"));
    }
    /**
     * test of method deleteItem.
     */
    @Test
    public void whenUserDeleteItemThenTrackerDeletes() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Input input = new StubInput(new String[]{"3", first.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(0).getName(), is("test2"));
    }
    /**
     * test of method showAll.
     */
    @Test
    public void whenAddThreeItemsThenShowAllItems() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        tracker.add(third);
        Input input = new StubInput(new String[]{"1", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(1).getDescription(), is("testDescription2"));
    }
    /**
     * test of method FindById.
     */
    @Test
    public void whenAddTwoItemsFindByIDFirstItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Input input = new StubInput(new String[]{"4", second.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(second.getId()), is(second));
    }
    /**
     * test of method FindByName.
     */
    @Test
    public void whenAddThreeItemsFindByNameSecondItem() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        tracker.add(first);
        Item second = new Item("test2", "testDescription2", 1234L);
        tracker.add(second);
        Item third = new Item("test3", "testDescription3", 12345L);
        tracker.add(third);
        Input input = new StubInput(new String[]{"5", "test3", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll().get(2).getName(), is("test3"));
    }
}
