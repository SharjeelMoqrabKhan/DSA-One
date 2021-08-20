package com.sharjeelmk.array.searching;

public class ArraySearching {
    // Linear Search
    public static int linearSearch(int [] arr,int key){
        for (int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return arr[i];
            }
        }
        return -1;
    }
}
