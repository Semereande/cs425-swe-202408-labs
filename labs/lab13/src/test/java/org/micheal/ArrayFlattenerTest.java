package org.micheal;

import org.junit.Test;
import org.semere.ArrayFlattener;

import static org.junit.Assert.*;

public class ArrayFlattenerTest {
    @Test
    public void flattenArrayTestThatResultIsCorrect() {
        int [][] input = {{1, 2}, {3, 4}, {5, 6}};
        int [] expectedOutput = {1, 2, 3, 4, 5, 6};
        int [] actualOutput = ArrayFlattener.flattenArray(input);

        assertArrayEquals("Invalid output array", actualOutput, expectedOutput);
    }

    @Test
    public void flattenArrayTestWhenInputIsNull() {
        int [][] input = null;
        int [] expectedOutput = null;
        int [] actualOutput = ArrayFlattener.flattenArray(input);

        assertArrayEquals("Invalid output array", actualOutput, expectedOutput);
    }
}