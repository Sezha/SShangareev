package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
/**
 * class StartUI.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.3.
 */
public class StartUI {
   private int[] ranges = {0, 1, 2, 3, 4, 5, 6};
   private final Input input;
   private final Tracker tracker;
   public StartUI(Input input, Tracker tracker) {
       this.input = input;
       this.tracker = tracker;
   }
    /**
     * method init.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        boolean exit = false;
        while (!exit) {
            menu.show();
            int key = input.ask("Select:  ", ranges);
            menu.select(key);
            if ("6".equals(String.valueOf(key))) {
                exit = true;
            }
        }
    }
    /**
     * main method.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(
                new ValidateInput(
                        new ConsoleInput()
                ),
                new Tracker()
        ).init();
    }
}
