package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test of CheckWord.
 * Тест проверки, что одно слово находится в другом слов.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */
public class CheckWordTest {

   /* @Test
    public void whenSubInWordThenTrue() {
        CheckWord testArray = new CheckWord();
        boolean result = testArray.contains("рефрижиратор", "жир");
        assertThat(result, is(true));
    }*/
    @Test
    public void whenSubNotInWordThenFalse() {
        CheckWord testArray = new CheckWord();
        boolean result = testArray.contains("Привет", "ик");
        assertThat(result, is(false));
    }
}