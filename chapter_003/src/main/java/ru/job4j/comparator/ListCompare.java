package ru.job4j.comparator;

import java.util.Comparator;

/**
 * class ListCompare.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 05/04/2018.
 */
public class ListCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = -1;
        if (Integer.compare(left.length(), right.length()) == 0) {
            for (int i = 0; i < left.length(); i++) {
                if (Character.compare(left.charAt(i), right.charAt(i)) != 0) {
                    result = Character.compare(left.charAt(i), right.charAt(i));
                    break;
                } else {
                    result = Integer.compare(left.length(), right.length());
                }
            }
        } else if (Integer.compare(left.length(), right.length()) > 0) {
            for (int i = 0; i < right.length(); i++) {
                if (Character.compare(left.charAt(i), right.charAt(i)) != 0) {
                    result = Character.compare(left.charAt(i), right.charAt(i));
                    break;
                } else {
                    result = Integer.compare(left.length(), right.length());
                }
            }
        } else if (Integer.compare(left.length(), right.length()) < 0) {
            for (int i = 0; i < left.length(); i++) {
                if (Character.compare(left.charAt(i), right.charAt(i)) != 0) {
                    result = Character.compare(left.charAt(i), right.charAt(i));
                    break;
                } else {
                    result = Integer.compare(left.length(), right.length());
                }
            }
        }
        return result;
    }
}
