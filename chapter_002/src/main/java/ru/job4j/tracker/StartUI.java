package ru.job4j.tracker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
/**
 * class StartUI.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.1.
 */
public class StartUI {
   private int[] ranges = {0, 1, 2, 3, 4, 5, 6};
    //  ArrayList<Integer> ranges = new ArrayList<>();
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

           menu.show();
           menu.select(input.ask("Select:  ", ranges));
       //} while (!"Y".equals(this.input.ask("Exit? (Y): ")));
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
