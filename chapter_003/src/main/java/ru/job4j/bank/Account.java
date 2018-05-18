package ru.job4j.bank;
/**
 * class User.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/14/2018.
 */
public class Account {
    /**
     * value is amount of money.
     */
    private double value;
    /**
     * requisites is bank account.
     */
    private String requisites;

    /**
     * constructor of class Account.
     * @param value value of account.
     * @param requisites user's requisites.
     */
    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    /**
     * method getValue.
     * @return value of account.
     */
    public double getValue() {
        return this.value;
    }

    /**
     * method getRequisites.
     * @return number of Requisites.
     */
    public String getRequisites() {
        return this.requisites;
    }
}
