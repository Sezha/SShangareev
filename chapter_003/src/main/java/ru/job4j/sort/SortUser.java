package ru.job4j.sort;

import java.util.*;

/**
 * class SortUser.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05/03/2018.
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

    /**
     * method sortNameLength.
     * @param list list of users.
     * @return list sorted by length of user's name.
     */
        public List<UserForSort> sortNameLength(List<UserForSort> list) {
            Collections.sort(list, new Comparator<UserForSort>() {
                        @Override
                        public int compare(UserForSort o1, UserForSort o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    }
            );
            return list;
        }

    /**
     * method sortByAllFields
     * @param list
     * @return
     */
    public List<UserForSort> sortByAllFields(List<UserForSort> list) {
        Collections.sort(list, new Comparator<UserForSort>() {
            @Override
            public int compare(UserForSort o1, UserForSort o2) {
                int result = o1.getName().compareTo(o2.getName());
                return result != 0 ? result : Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        return  list;
        }
}
