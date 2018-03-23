package ru.job4j.array;

/**
 * class ArrayChar.
 * Слова начинается с ...
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет. что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинаеться с префикса
     */
    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();

        // проверить. что массив data имеет первые элементы одинаковые с value
        return ((data[0] == value[0]) && (data[1] == value[1]));

    }
}
