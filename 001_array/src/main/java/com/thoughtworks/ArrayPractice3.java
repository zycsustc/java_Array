package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayPractice3 {


    public static int[] addX(int arr[], int x)
    {
        int i;
        int n =  arr.length;
        // create a new array of size n+1
        int[] newarr = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr[i] = arr[i];

        newarr[n] = x;

        return newarr;
    }

    public static int[] filterZero(int[] array) {
        int[] arr = new int[0];
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                continue;
            }else{
                arr = addX(arr, array[i]);
            }
        }
        //int size = list1.size();
        //int[] test = list1.toArray();
        //Integer[] array2 = (Integer[])list1.toArray(new Integer[size]);

        return arr;
    }
}
