package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConverterTest {
    @Test
    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
    public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.rubleToDollar(70);
        assertThat(result, is(1));
    }

    @Test
    public void when20EuroToRubleThen1400() {
        Converter converter = new Converter();
        int result = converter.euroToRuble(20);
        assertThat(result, is(1400));
    }

    @Test
    public void when20DollarToRubleThen1200() {
        Converter converter = new Converter();
        int result = converter.dollarToRuble(20);
        assertThat(result, is(1200));
    }
}