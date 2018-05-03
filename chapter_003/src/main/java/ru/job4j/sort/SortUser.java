package ru.job4j.sort;

import java.util.*;

/**
 * class SortUser.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/02/2018.
 */
public class SortUser {
    /**
     * method sort.
     * @param list list of users.
     * @return sorted by age set of users.
     */
        public Set<UserForSort> sort(List<UserForSort> list) {
            return new TreeSet<>(list);
        }
}
