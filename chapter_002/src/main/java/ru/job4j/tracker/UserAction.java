package ru.job4j.tracker;

/**
 * interface UserAction.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public interface UserAction {
    int key();
    void execute(Input input, Tracker tracker);
    String info();
}
