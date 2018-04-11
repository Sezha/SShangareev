package ru.job4j.paint;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class PaintTest.
 * test of class Paint.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class PaintTest {

    @Test
    public void whenDrawSquare() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишущие в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("+ + + +")
                                .append("+     +")
                                .append("+     +")
                                .append("+ + + +")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
}