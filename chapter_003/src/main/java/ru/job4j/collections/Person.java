package ru.job4j.collections;

/**
 * class Person.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04.25.2018.
 */
public class Person {
    private String name;
    private String surname;
    private String phone;
    private String address;

    /**
     * Constructor of class Person.
     * @param name
     * @param surname
     * @param phone
     * @param address
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * method getName.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * method getSurname.
     * @return surname.
     */
    public String getSurname() {
        return surname;
    }

    /**
     * method getPhone.
     * @return phone.
     */
    public String getPhone() {
        return phone;
    }

    /**
     * method getAddress.
     * @return address.
     */
    public String getAddress() {
        return address;
    }
}