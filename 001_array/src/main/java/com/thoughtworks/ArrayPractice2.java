package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice2 {

    public static int[] exchange() {
        int[] array = new int[]{10, 8, 1, 7, 0, 20, 16, 19};
        int max = array[0];
        int pos = 0;
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                pos = i;
            }
        }
        int temp = array[0];
        array[0] = max;
        array[pos] = temp;
        //System.out.println(Arrays.toString(array));
        return array;
    }
}
