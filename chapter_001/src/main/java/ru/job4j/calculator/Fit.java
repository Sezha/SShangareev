package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Fit {
    /**
     * Коэффициент разницы для роста мужчин
     * Cтатическая константа
     */
    public static final int DIFFERENCE_FOR_MAN_HEIGHT = 100;

    /**
     * Коэффициент разницы для роста женщин
     * Cтатическая константа
     */
    public static final int DIFFERENCE_FOR_WOMEN_HEIGHT = 110;

    /**
     * Коэффициент для веса
     * Cтатическая константа
     */
    public static final double RATE_FOR_WEIGHT = 1.15;
    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */

    public double manWeight(double height) {
        return ((height - DIFFERENCE_FOR_MAN_HEIGHT) * RATE_FOR_WEIGHT);
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        return ((height - DIFFERENCE_FOR_WOMEN_HEIGHT) * RATE_FOR_WEIGHT);
    }
}
