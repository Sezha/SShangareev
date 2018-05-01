package ru.job4j.users;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
/**
 * test of class UserConvert.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/01/2018.
 */
public class UserConvertTest {
    @Test
    public void whenPutTwoUsersThenGetCityOfAndrei() {
        UserConvert convert = new UserConvert();
        List<User> list = new LinkedList<>();
        list.add(new User(007, "Sergei", "EKB"));
        list.add(new User(002, "Andrei", "San Francisco"));
        HashMap<Integer, User> result = convert.process(list);
        assertThat(result.get(002).getCity(), is("San Francisco"));
    }
}