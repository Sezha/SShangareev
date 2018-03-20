package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* TEST class Square. 
* Тест заполнения массива числами со степенью.
* @author Sergei Shangareev (sezhaekb@gmail.com).
* @version 1.0
*/
public class SquareTest {
	@Test
	public void whenTakeFiveThenArrayFromFiveNumbersOneFourNineSixteenTwentyfive() {
		Square testArray = new Square();
		int[] result = testArray.calculate(5);
		int[] expected = {1, 4, 9, 16, 25};
		assertThat(result, is(expected));
	}
}
