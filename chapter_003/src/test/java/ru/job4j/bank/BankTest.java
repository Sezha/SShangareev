package ru.job4j.bank;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * test of class Bank.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/14/2018.
 */
public class BankTest {
    /**
     * test of method addUser.
     */
    @Test
    public void whenAddTwoUsersThenGetSecondUserByPassport() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        User secondUser = new User("Sergei", "669600");
        tempBank.addUser(firstUser);
        tempBank.addUser(secondUser);
        assertThat(tempBank.findUserByPassport("669600"), is(secondUser));
    }

    /**
     * test of method deleteUser.
     */
    @Test
    public void deleteUser() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        User secondUser = new User("Sergei", "669600");
        tempBank.addUser(firstUser);
        tempBank.addUser(secondUser);
        tempBank.deleteUser(firstUser);
        User user = tempBank.findUserByPassport("543500");
        User userDeleted = null;
        assertThat(user, is(userDeleted));
    }

    /**
     * test of method addAccountToUser.
     */
    @Test
    public void whenAddOneUserAndAddTwoAccountsThenGetTwoAccountsOfThisUser() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        tempBank.addUser(firstUser);
        Account firstAccount = new Account(1000.00, "408002");
        Account secondAccount = new Account(20.00, "408001");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("543500", secondAccount);
        List<Account> expect = Arrays.asList(firstAccount, secondAccount);
        assertThat(tempBank.getUserAccounts("543500"), is(expect));
    }

    /**
     * test of method deleteAccountFromUser.
     */
    @Test
    public void whenAddOneUserWithTwoAccountsThenGetOneAccountOfThisUser() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        tempBank.addUser(firstUser);
        Account firstAccount = new Account(1000.00, "408002");
        Account secondAccount = new Account(20.00, "408001");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("543500", secondAccount);
        tempBank.deleteAccountFromUser("543500", firstAccount);
        List<Account> expect = Arrays.asList(secondAccount);
        assertThat(tempBank.getUserAccounts("543500"), is(expect));
    }

    /**
     * test of method getUserAccounts.
     */
    @Test
    public void whenAddTwoUsersWithTwoAccountsThenGetAccountsOfFirstUser() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        User secondUser = new User("Sergei", "669600");
        tempBank.addUser(firstUser);
        tempBank.addUser(secondUser);
        Account firstAccount = new Account(1000.00, "408122");
        Account secondAccount = new Account(20.00, "408001");
        Account secondAccountTwo = new Account(10.00, "408002");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("669600", secondAccount);
        tempBank.addAccountToUser("669600", secondAccountTwo);
        List<Account> expect = Arrays.asList(secondAccount, secondAccountTwo);
        assertThat(tempBank.getUserAccounts("669600"), is(expect));
    }

    /**
     * test of method transferMoney.
     * whenTransferFromFirstAccountOnSecondAccountOfUserThenTrue.
     */
    @Test
    public void whenTransferFromFirstAccountOnSecondAccountOfUserThenTrue() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        tempBank.addUser(firstUser);
        Account firstAccount = new Account(10.00, "408122");
        Account secondAccount = new Account(180.00, "408001");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("543500", secondAccount);
        assertThat(tempBank.transferMoney("543500", "408122",
                                        "543500", "408001",
                                            5.0), is(true));
    }

    /**
     * test of method transferMoney.
     * whenTransferFromFirstAccountFirstUserOnFirstAccountOfSecondUserThenTrue.
     */
    @Test
    public void whenTransferFromFirstAccountFirstUserOnFirstAccountOfSecondUserThenTrue() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        User secondUser = new User("Sergei", "669600");
        tempBank.addUser(firstUser);
        tempBank.addUser(secondUser);
        Account firstAccount = new Account(10.00, "408122");
        Account secondAccount = new Account(180.00, "408001");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("669600", secondAccount);
        assertThat(tempBank.transferMoney("543500", "408122",
                "669600", "408001",
                5.0), is(true));
    }

    /**
     * test of method transferMoney.
     * whenTransferFromFirstAccountFirstUserOnFirstAccountOfSecondUserAndAmountLessValueThenFalse.
     */
    @Test
    public void whenTransferFromFirstAccountFirstUserOnFirstAccountOfSecondUserAndAmountLessValueThenFalse() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        User secondUser = new User("Sergei", "669600");
        tempBank.addUser(firstUser);
        tempBank.addUser(secondUser);
        Account firstAccount = new Account(10.00, "408122");
        Account secondAccount = new Account(180.00, "408001");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("669600", secondAccount);
        assertThat(tempBank.transferMoney("543500", "408122",
                "669600", "408001",
                50.0), is(false));
    }

    /**
     * test of method transferMoney.
     * whenTransferFromFirstAccountFirstUserOnFirstAccountOfSecondUserAndAmountLessValueThenFalse.
     */
    @Test
    public void whenTransferFromFirstAccountFirstUserOnFirstAccountOfSecondUserAndNoSuchAccountThenFalse() {
        Bank tempBank = new Bank();
        User firstUser = new User("Andrei", "543500");
        User secondUser = new User("Sergei", "669600");
        tempBank.addUser(firstUser);
        tempBank.addUser(secondUser);
        Account firstAccount = new Account(10.00, "408122");
        Account secondAccount = new Account(180.00, "408001");
        tempBank.addAccountToUser("543500", firstAccount);
        tempBank.addAccountToUser("669600", secondAccount);
        assertThat(tempBank.transferMoney("543500", "408122",
                "669600", "408000",
                5.0), is(false));
    }
}