package ru.job4j.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * class PriorityQueue.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.29.2018.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * method put.
     * @param task
     */
    public void put(Task task) {
        int position = 0;
        if (tasks.isEmpty()) {
            tasks.add(position, task);
            position++;
        } else if (tasks.size() < 2 & task.getPriority() > tasks.get(position).getPriority()) {
            tasks.add(position++, task);
        } /*else if (tasks.size() < 2 & task.getPriority() < tasks.get(position).getPriority()) {
            Task temp = tasks.get(position);
            tasks.set(position, task);
            tasks.add(position++, temp);
        } else if (tasks.size() >= 3 & task.getPriority() < tasks.get(position).getPriority()
                & task.getPriority() > tasks.get(position - 1).getPriority()) {
            Task temp = tasks.get(position);
            tasks.set(position, task);
            tasks.add(position++, temp);
        } else if (tasks.size() >= 3 & task.getPriority() > tasks.get(position).getPriority()) {
            tasks.add(position++, task);

        }*/

    }

    /**
     * method take.
     * @return retrieved task.
     */
    public Task take() {
        return this.tasks.poll();
    }
}
