package ru.job4j.comparator;

import java.util.Comparator;

/**
 * class ListCompare.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 2.1.
 * @since 05/07/2018.
 */
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {

        int size = Math.min(left.length(), right.length());
        int result = 0;
        for (int i = 0; i < size; i++) {
            result = Integer.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }
        if (result == 0 && left.length() != right.length()) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
