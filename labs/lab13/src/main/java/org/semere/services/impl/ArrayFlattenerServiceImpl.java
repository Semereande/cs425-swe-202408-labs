package org.semere.services.impl;

import org.semere.ArrayFlattener;
import org.semere.services.ArrayFlattenerService;

public class ArrayFlattenerServiceImpl implements ArrayFlattenerService {
    @Override
    public int[] flattenArray(int[][] inputArray) {
        return ArrayFlattener.flattenArray(inputArray);
    }
}
