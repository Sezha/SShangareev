package ru.job4j.sort;

import java.util.Comparator;

/**
 * class UserForSort.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/02/2018.
 */
public class UserForSort implements Comparable<UserForSort> {
    private String name;
    private Integer age;
    /**
     * constructor of class UserForSort.
     * @param name name of user.
     * @param age age of user.
     */
    UserForSort(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "User: " + name + ", Age: " + age;
    }
    /**
     * method getName.
     * @return name of user.
     */
    public String getName() {
        return name;
    }
    /**
     * method getAge.
     * @return age of user.
     */
    public int getAge() {
        return age;
    }
    @Override
    public int compareTo(UserForSort o) {
        return this.age.compareTo(o.age);
    }
}
