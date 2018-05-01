package ru.job4j.users;

/**
 * class User.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/01/2018.
 */
public class User {
    private String name;
    private Integer id;
    private String city;
    /**
     * constructor of class User.
     * @param id id.
     * @param name name.
     * @param city  city.
     */
   public User(int id, String name, String city) {
    this.id = id;
    this.name = name;
    this.city = city;
    }
    /**
     * method getId.
     * @return id of user.
     */
    public Integer getId() {
        return id;
    }
    /**
     * method getName.
     * @return name of user.
     */
    public String getName() {
        return name;
    }
    /**
     * method getCity.
     * @return city of user.
     */
    public String getCity() {
        return city;
    }
}
