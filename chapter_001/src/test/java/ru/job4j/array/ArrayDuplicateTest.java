
package ru.job4j.array;

import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test of class ArrayDuplicate.
 * @author Sergei Shangareev (sezhaekb@gmail.com)
 * @cersiob 1.0
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate testArray = new ArrayDuplicate();
        String[] input = {"City", "Cat", "beer", "Money", "cat", "PC", "Java", "Money"};
        String[] expected = {"City", "Cat", "beer", "Money", "PC", "Java", "cat"};
        String[] result = testArray.remove(input);
        assertThat(result, arrayContainingInAnyOrder(expected));


    }

}