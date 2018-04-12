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
 * @version 2.0.
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
    public void whenUserAddTwoItemsThenTrackerHasSecondItemWithSameName() {
        //Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name two", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("test name two"));
        }
    /**
     * test of method editItem.
     */
    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        //Tracker tracker = new Tracker();
        //Item item = tracker.add(new Item());
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    /**
     * test of method deleteItem.
     */
    @Test
    public void whenUserDeleteItemThenTrackerDeletes() {
       // Tracker tracker = new Tracker();
       // Item item = tracker.add(new Item());
        Item item2 = tracker.add(new Item());
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0].getId(), is(item2.getId()));
    }
    /**
     * test of method showAll.
     */
    @Test
    public void whenAddThreeItemsThenShowAllItems() {
        //Item item = tracker.add(new Item());
        Input input = new StubInput(new String[]{"1", "test name", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * test of method FindById.
     */
    @Test
    public void whenAddTwoItemsFindByIDFirstItem(){
        Input input = new StubInput(new String[]{"0", "test name two", "desc", "6"});
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(tracker.findAll()[0].getId()), is(item));
    }
    /**
     * test of method FindByName.
     */
    @Test
    public void whenAddThreeItemsFindByNameSecondItem(){
        Input input = new StubInput(new String[]{"0", "test name two", "desc2", "6"});
        Input input2 = new StubInput(new String[]{"0", "test name three", "desc3", "6"});
        new StartUI(input, tracker).init();
        new StartUI(input2, tracker).init();
        assertThat(tracker.findAll()[1].getName(), is("test name two"));
    }
}
