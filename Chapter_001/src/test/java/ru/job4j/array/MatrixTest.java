package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test of class Matrix.
 * Тест таблицы умножения.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class MatrixTest {
    @Test
    public void setFiveSizeGetMatrixOfFive(){
        Matrix testMatrix = new Matrix();
        int [][] temp = testMatrix.multiple(5);
        int [][] expected = {{0, 0, 0, 0, 0}, {0, 1, 2, 3, 4}, {0, 2, 4, 6, 8}, {0, 3, 6, 9, 12},
                {0, 4, 8, 12, 16}}                ;
        assertThat(temp, is(expected));
    }
}
