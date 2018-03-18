package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test of Max
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @version 1.0
 */

public class MaxTest {
	@Test
	public void whenFirstLessSecond() {
		Max maximum = new Max();
			int result = maximum.max(1, 2);
			assertThat(result, is(2));
	}

}