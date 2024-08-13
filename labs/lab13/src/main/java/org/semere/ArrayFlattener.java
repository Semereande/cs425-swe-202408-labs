package org.semere;

public class ArrayFlattener {
   public static int[] flattenArray(int [][] a_in){
       if(a_in == null) return null;
       int[] result = new int[getTotalLength(a_in)];
       int index=0;
       for(int a[]:a_in){
           for(int n:a){
               result[index]=n;
               index++;
           }
       }
       System.out.println(result);
       return result;
   }

   private static int getTotalLength(int [][] a_in){
       int result = 0;
       for(int[] a:a_in){
           result+=a.length;
       }
       return  result;
   }
}
