package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** 
* TEST Подсчетa суммы чётных чисел в диапазонe
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class CounterTest { 
	@Test
	public void sumOfEvenFromOneAndTen() {
		Counter counterEven = new Counter();
		int summ = counterEven.add(1, 10);
		assertThat(summ, is(30));
	}
}