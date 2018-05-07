package ru.job4j.collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * class PriorityQueue.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05.07.2018.
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * method put.
     * @param task task.
     */
    public void put(Task task) {
        int size = this.tasks.size();
        for (int index = 0; index != size; index++) {
                if (tasks.get(index).getPriority() > task.getPriority()) {
                    tasks.add(index, task);
                    break;
                }
            }
        tasks.add(size, task);
    }

    /**
     * method take.
     * @return retrieved task.
     */
    public Task take() {
        return this.tasks.poll();
    }
}
