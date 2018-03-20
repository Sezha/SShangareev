package ru.job4j.loop;

import java.util.function.BiPredicate;
/**
 * Class Paint creating pyramid
 * @author Sergei Shangsreev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class Paint {
    /**
     * Method rightTriangle create a right side of pyramid
     * @param height Высота правого треугольника
     * @return
     */
    public String rightTriangle(int height) {

        return this.loopBy(
                height,
                height,
                (row, column) -> row >= column
        );

        /*
        // Буфер для результата.
        StringBuilder screen = new StringBuilder();
        // ширина будет равна высоте.
        int weight = height;
        // внешний цикл двигается по строкам.
        for (int row = 0; row != height; row++) {
            // внутренний цикл определяет положение ячейки в строке.
            for (int column = 0; column != weight; column++) {
                // если строка равна ячейки, то рисуем галку.
                // в данном случае строка определяем, сколько галок будет на строке
                if (row >= column) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            // добавляем перевод строки.
            screen.append(System.lineSeparator());
        }
        // Получаем результат.
        return screen.toString();
        */
    }

    /**
     * Method leftTriangle create a lest side of pyramid
     * @param height Высота левого треугольника
     * @return
     */
    public String leftTriangle(int height) {
        return this.loopBy(
                height,
                height,
                (row, column) -> row >= height - column - 1
        );
        /*
        StringBuilder screen = new StringBuilder();
        int weight = height;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (row >= weight - column - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
        */
    }

    /**
     * Method pyramid create a lest side of pyramid
     * @param height Высота пирамиды
     * @return
     */
    public String pyramid(int height) {
        return this.loopBy(
                height,
                2 * height - 1,
                (row, column) -> row >= height - column - 1 && row + height - 1 >= column
        );
        /*
        StringBuilder screen = new StringBuilder();
        int weight = 2 * height - 1;
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if ((row >= (height - column - 1)) && ((row + height - 1) >= column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
        */
    }

    /**
     * Method loopBy
     * @param height
     * @param weight
     * @param predict
     * @return
     */
    private String loopBy(int height, int weight, BiPredicate<Integer, Integer> predict) {
        StringBuilder screen = new StringBuilder();
        for (int row = 0; row != height; row++) {
            for (int column = 0; column != weight; column++) {
                if (predict.test(row, column)) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(System.lineSeparator());
        }
        return screen.toString();
    }
}
