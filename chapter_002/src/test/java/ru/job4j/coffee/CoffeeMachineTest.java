package ru.job4j.coffee;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test of class CoffeeMachine.
 * @author  Sergei Shangareev (sezhaekb@gmail.com).
 * @version 1.0.
 * @since 04/27/2018.
 */
public class CoffeeMachineTest {

    @Test
    public void whenPutTwoHundredWithPriceSixtyFourThenReturnFiveAndOneHundredThirty() {
        CoffeeMachine coffee = new CoffeeMachine();
        int[] resultArray = coffee.changes(200, 64);
        int[] expectArray = {1, 0, 5, 130};
        assertThat(resultArray, is(expectArray));
    }

    @Test
    public void whenPutTwoHundredWithPriceFiftyThenReturnOneHundredFifty() {
        CoffeeMachine coffee = new CoffeeMachine();
        int[] resultArray = coffee.changes(200, 50);
        int[] expectArray = {0, 0, 0, 150};
        assertThat(resultArray, is(expectArray));
    }
}