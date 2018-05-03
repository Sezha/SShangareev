package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * test of class SortUser.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/02/2018.
 */
public class SortUserTest {

    @Test
    public void whenThreeUsersTHenShowAllAscendingByAge() {
        SortUser sortList = new SortUser();
        List<UserForSort> listUsers = new LinkedList<UserForSort>();
        listUsers.add(new UserForSort("Sergei", 33));
        listUsers.add(new UserForSort("Misha", 15));
        listUsers.add(new UserForSort("Stepan", 20));
        Set<UserForSort> result = sortList.sort(listUsers);
        List<UserForSort> listUsersSorted = new LinkedList<UserForSort>();
        listUsersSorted.add(new UserForSort("Misha", 15));
        listUsersSorted.add(new UserForSort("Stepan", 20));
        listUsersSorted.add(new UserForSort("Sergei", 33));
        Set<UserForSort> expect = new TreeSet<UserForSort>();
        expect.addAll(listUsersSorted);
        assertThat(result, is(expect));
    }
}