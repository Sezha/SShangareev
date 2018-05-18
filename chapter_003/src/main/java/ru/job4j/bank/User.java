package ru.job4j.bank;

import java.util.Objects;

/**
 * class User.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/14/2018.
 */
public class User implements Comparable<User> {
    /**
     * name of user.
     */
    String name;
    /**
     * number of user's passport.
     */
    String passport;

    /**
     * constructor of class User.
     * @param name name of user.
     * @param passport number of user's passport.
     */
    public User(String name, String passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * method getName.
     * @return user's name.
     */
    public String getName() {
        return name;
    }

    /**
     * method equals.
     * @return boolean of compare.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(getPassport(), user.getPassport())
                && Objects.equals(getName(), user.getName());
    }

    /**
     * method hashCode.
     * @return number of hashcode.
     */
    public int hashCode() {
        return Objects.hash(name, passport);
    }

    /**
     * method getPassport.
     * @return number of passport.
     */
    public String getPassport() {
        return  this.passport;
    }

    @Override
    public int compareTo(User o) {
        return this.getName().compareTo(o.getName());
    }
}
