package ru.job4j.calculator;

/**
 * Корвертор валюты.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Converter {
    /**
     * Курс долллара
     */
    private int dollar = 60;

    /**
     * Курс евро
     */
    private int euro = 70;

    /**
     * Конвертируем рубли в евро.
     * @param value рубли.
     * @return Евро.
     */
    public int rubleToEuro(int value) {

        return (value / euro);
    }

    /**
     * Конвертируем рубли в доллары.
     * @param value рубли.
     * @return Доллоры
     */
    public int rubleToDollar(int value) {

        return (value / dollar);
    }

    /**
     * Конвертируем евро  в рубли.
     * @param value евро.
     * @return рубли.
     */
    public int euroToRuble(int value) {

        return (value * euro);
    }

    /**
     * Конвертируем доллары  в рубли.
     * @param value доллары.
     * @return рубли.
     */
    public int dollarToRuble(int value) {

        return (value * dollar);
    }
}