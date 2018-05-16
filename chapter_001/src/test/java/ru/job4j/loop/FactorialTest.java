package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/** 
* TEST программы вычисляющей факториал
* @author Sergei Shangareev (sezhaekb@gmail.com)
* @version 1.0
*/
public class FactorialTest { 
	@Test
	public void factorialNumberFiveIsOneHundredTwenty() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		assertThat(result, is(120));
	}

	public void factorialNumberNullIsOne() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		assertThat(result, is(1));
	}
}