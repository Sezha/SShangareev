package ru.job4j.paint;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class TriangleTest.
 * test of class Triangle.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class TriangleTest {
    /**
     * test of method draw.
     */
    @Test
    public void whenDrawTriangle() {
        Triangle form = new Triangle();
        assertThat(form.draw(), is(new StringBuilder()
                        .append("*    ")
                        .append("**   ")
                        .append("***  ")
                        .append("**** ")
                        .append("*****")
                        .toString()
                )
        );
    }
}