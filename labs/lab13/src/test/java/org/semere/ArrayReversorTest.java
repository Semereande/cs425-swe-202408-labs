package org.semere;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.semere.services.ArrayFlattenerService;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ArrayReversorTest {
    @Mock
    private ArrayFlattenerService arrayFlattenerService;
    private ArrayReversor arrayReversor;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseArrayTestThatResultIsCorrect() {
        int [][] input = {{1, 2}, {3, 4}, {5, 6}};
        int [] flattenedOutput = {1, 2, 3, 4, 5, 6};

        when(arrayFlattenerService.flattenArray(input)).thenReturn(flattenedOutput);
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);

        int[] expectedOutput = {6,5,4,3,2,1};
        int [] actualOutput = this.arrayReversor.reverseArray(input);

        assertArrayEquals(expectedOutput, actualOutput);

        verify(arrayFlattenerService, times(1)).flattenArray(input);
    }

    @Test
    public void reverseArrayTestWhenInputIsNull() {
        int [][] input = null;
        int [] flattenedOutput = null;

        when(arrayFlattenerService.flattenArray(input)).thenReturn(flattenedOutput);
        this.arrayReversor = new ArrayReversor(arrayFlattenerService);

        int[] expectedOutput = null;
        int [] actualOutput = this.arrayReversor.reverseArray(input);

        assertArrayEquals(expectedOutput, actualOutput);

        verify(arrayFlattenerService, times(1)).flattenArray(input);
    }
}