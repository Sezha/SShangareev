package ru.job4j.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * class Bank.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/14/2018.
 */
public class Bank {
    /**
     * collection userAccount of user's accounts.
     */
    private Map<User, ArrayList<Account>> userAccounts = new TreeMap<>();

    /**
     * method addUser.
     * @param user user.
     */
    public void addUser(User user) {
       userAccounts.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * method deleteUser.
     * @param user user.
     */
    public void deleteUser(User user) {
                userAccounts.remove(user);
    }

    /**
     * method addAccountToUser
     * @param passport number of passport.
     * @param account new account of user.
     */
    public void addAccountToUser(String passport, Account account) {
        User user = findUserByPassport(passport);
        if (user != null) {
            userAccounts.get(user).add(account);
        } else {
            System.out.println("No user with such passport");
        }
    }

    /**
     * method findUserByPassport.
     * @param passport number of passport.
     * @return user.
     */
    public User findUserByPassport(String passport) {
        User result = null;
        for (User user : userAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                result = user;
            }
        }
        return result;
    }

    /**
     * method deleteAccountFromUser.
     * @param passport number of passport.
     * @param account account of user for deleting.
     */
    public void deleteAccountFromUser(String passport, Account account) {
        User result = null;
        for (User user : userAccounts.keySet()) {
            if (user.getPassport().equals(passport)) {
                userAccounts.get(findUserByPassport(passport)).remove(account);
                break;
            } else {
                System.out.println("No user with such passport");
            }
        }
    }

    /**
     * method getUserAccounts.
     * @param passport number of passport.
     * @return list of user's accounts.
     */
    public List<Account> getUserAccounts(String passport) {
        List<Account> result = userAccounts.get(findUserByPassport(passport));
        return result;
    }

        /**
         * mathod transferMoney.
         * @param srcPassport from number of user's passport from.
         * @param srcRequisite from user's bank account.
         * @param destPassport to number of user's passport.
         * @param destRequisite to user's bank account.
         * @param amount amount of money.
         * @return true or false.
         */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                  String destPassport, String destRequisite, double amount) {
        boolean successSrc = false;
        boolean successDest = false;
        boolean success = false;

        List<Account> srcAccounts = getUserAccounts(srcPassport);
        List<Account> destAccounts = getUserAccounts(destPassport);

        for (Account items : srcAccounts) {
            if (srcAccounts != null && items.getRequisites().equals(srcRequisite)
                    && amount > 0
                    && amount < items.getValue()) {
                successSrc = true;
            }
        }
        for (Account items : destAccounts) {
            if (destAccounts != null && items.getRequisites().equals(destRequisite)) {
                successDest = true;
            }
        }
        if (successSrc && successDest) {
            success = true;
        }
        return success;
    }
}
