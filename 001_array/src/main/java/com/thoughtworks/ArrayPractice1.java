package com.thoughtworks;

import java.util.Arrays;

public class ArrayPractice1 {

    public static void main(String[] args) {
        printArrayReverse();
    }

    public static void printArrayReverse() {
        int[] array = new int[]{1, 2, 3};
        int[] arrayReverse = new int[array.length];
        for(int i=0;i<array.length;i++){
            arrayReverse[i] = array[array.length-i-1];
        }
        System.out.println(Arrays.toString(arrayReverse));
    }
}
