package ru.job4j.tracker;
 /**
  * interface Input.
  * @author Sergei Shangareev (sezhaekb@gmail.com).
  * @version 1.1.
  */
public interface Input {
    String ask(String question);
    int ask(String question, int[] range);
}
