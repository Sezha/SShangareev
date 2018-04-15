package ru.job4j.tracker;

/**
 * abstract class BaseAction.
 * @author  Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public abstract class BaseAction implements UserAction {
    private final int key;
    private final String name;
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }
    @Override
    public int key() {
        return  this.key;
    }
    @Override
    public String info() {
        return String.format("%s : %s", this.key, this.name);
    }
}
