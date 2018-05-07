package ru.job4j.collections;
/**
 * class Task.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05.07.2018.
 */
public class Task {
    private String desc;
    private  int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     * method getDesc.
     * @return description.
     */
    public String getDesc() {
        return desc;
    }

    /**
     * method getPriority.
     * @return priority
     */
    public int getPriority() {
        return priority;
    }
}
