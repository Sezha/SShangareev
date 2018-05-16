package ru.job4j.calculator;

/**
 * Корвертор валюты.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Converter {
    /**
     * Курс долллара
     * Cтатическая константа
     */
    public static final int DOLLAR = 60;

    /**
     * Курс евро
     * Cтатическая константа
     */
    public static final int EURO = 70;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {

        return (value / EURO);
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {

        return (value / DOLLAR);
    }

    /**
     * Конвертируем евро  в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {

        return (value * EURO);
    }

    /**
     * Конвертируем доллары  в рубли.
     * @param value доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {

        return (value * DOLLAR);
    }
}