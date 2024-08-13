package org.semere;

import org.semere.services.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public int[] reverseArray(int[][] a_in){
        var flattened = this.arrayFlattenerService.flattenArray(a_in);
        return reverseArray(flattened);
    }

    private int[] reverseArray(int[] inputArray){
        if(inputArray==null) return null;
        int[] outputArray = new int[inputArray.length];
        int count = 0;
        for(int i=inputArray.length-1;i>=0;i--){
            outputArray[count] = inputArray[i];
            count++;
        }

        return outputArray;
    }
}
