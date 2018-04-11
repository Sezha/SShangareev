package ru.job4j.paint;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * class SquareTest.
 * test of class Square.
 * @author Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 */
public class SquareTest {
    /**
     * test of method draw.
     */
    @Test
    public void whenDrawSquare() {
        Square form = new Square();
        assertThat(form.draw(), is(new StringBuilder()
                                    .append("+ + + +")
                                    .append("+     +")
                                    .append("+     +")
                                    .append("+ + + +")
                                    .toString()
                                    )
        );
    }
}