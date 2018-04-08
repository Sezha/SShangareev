package ru.job4j.Tracker;

import java.util.*;
/**
 * class ConsoleInput.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);
    public String ask(String question) {
        System.out.println(question);
        return scanner.nextLine();
    }
}
