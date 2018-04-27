package ru.job4j.collections;

import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * test of class PhoneDictionary.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.25.2018.
 */
public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Sergei", "Shangareev", "8899", "Yekaterinburg"));
        List<Person> persons = phones.find("Sergei");
        assertThat(persons.iterator().next().getPhone(), is("8899"));
    }
}
