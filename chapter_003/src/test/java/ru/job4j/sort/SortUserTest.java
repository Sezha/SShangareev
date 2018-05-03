package ru.job4j.sort;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * test of class SortUser.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.0.
 * @since 05/03/2018.
 */
public class SortUserTest {
    /**
     * test of method sort.
     */
    @Test
    public void whenThreeUsersThenShowAllAscendingByAge() {
        SortUser sortList = new SortUser();
        List<UserForSort> listUsers = new ArrayList<>();
        listUsers.add(new UserForSort("Sergei", 33));
        listUsers.add(new UserForSort("Misha", 15));
        listUsers.add(new UserForSort("Stepan", 20));
        Set<UserForSort> result = sortList.sort(listUsers);
        assertThat(result.iterator().next().getAge(), is(15));
    }

    /**
     * test of method sortNameLength.
     */
    @Test
    public void whenThreeUsersThenShowAllAscendingByLengthOfName() {
        SortUser sortList = new SortUser();
        List<UserForSort> listUsers = new ArrayList<>();
        listUsers.add(new UserForSort("Stepanchik", 33));
        listUsers.add(new UserForSort("Misha", 15));
        listUsers.add(new UserForSort("Alex", 20));
        List<UserForSort> result = sortList.sortNameLength(listUsers);
        assertThat(result.iterator().next().getAge(), is(20));
    }

    /**
     * test of method sortByAllFields.
     */
    @Test
    public void whenThreeUsersThenShowAllAscendingByAllField() {
        SortUser sortList = new SortUser();
        List<UserForSort> listUsers = new ArrayList<>();
        listUsers.add(new UserForSort("Stepan", 33));
        listUsers.add(new UserForSort("Alex", 14));
        listUsers.add(new UserForSort("Stepan", 20));
        listUsers.add(new UserForSort("Alex", 16));
        List<UserForSort> result = sortList.sortByAllFields(listUsers);
        assertThat(result.iterator().next().getAge(), is(14));
    }
}