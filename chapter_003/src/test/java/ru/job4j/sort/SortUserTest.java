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
    public void whenThreeUsersThenShowAllAscendingByAge() {
        SortUser sortList = new SortUser();
        List<UserForSort> listUsers = new ArrayList<>();
        listUsers.add(new UserForSort("Sergei", 33));
        listUsers.add(new UserForSort("Misha", 15));
        listUsers.add(new UserForSort("Stepan", 20));
        Set<UserForSort> result = sortList.sort(listUsers);
        assertThat(result.iterator().next().getAge(), is(15));
    }
}