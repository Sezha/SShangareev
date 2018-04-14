package ru.job4j.tracker;
import java.util.Arrays;
import java.util.Date;
/**
 * class StartUI.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 */
public class StartUI {
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
       Tracker tracker = new Tracker();
       MenuTracker menu = new MenuTracker(this.input, tracker);
       menu.fillActions();
       int key;
       do {
           menu.show();
           key = Integer.valueOf(input.ask("Select: "));
           menu.select(key);
       } while (key != 6);
   }
    /**
     * main method.
     * @param args
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }
}
