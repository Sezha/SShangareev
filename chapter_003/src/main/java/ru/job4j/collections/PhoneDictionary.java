package ru.job4j.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * class PhoneDictionary.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.25.2018.
 */
public class PhoneDictionary {
    private List<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Return list of all users containing key in any field.
     * @param key search key.
     * @return list of all appropriate users.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (persons.iterator().next().getName().contains(key)
                    ||persons.iterator().next().getSurname().contains(key)
                    ||persons.iterator().next().getPhone().contains(key)
                    ||persons.iterator().next().getAddress().contains(key)) {
                result.add(value);
                break;
            }
        }
        return result;
    }
}
