package com.thoughtworks;

public class ArrayPractice4 {

    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int pos = array.length;
        for(int i=0;i<array.length;i++) {
            if (number >= array[i]) {
                continue;
            } else {
                pos = i;
                break;
            }
        }
        int[] array2 =  new int[array.length+1];
        for(int i=0;i<array2.length;i++){
            if(i==pos){
                array2[i] = number;
            }
            else if(i<pos){
                array2[i] = array[i];
            }else{
                array2[i] = array[i-1];
            }
        }
        return array2;
    }
}
