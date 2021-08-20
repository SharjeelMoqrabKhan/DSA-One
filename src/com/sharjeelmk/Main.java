package com.sharjeelmk;

import com.sharjeelmk.array.searching.ArraySearching;

public class Main {
    public static void main(String[] args) {
        int [] arr = {11,44,100,404};
        int key=100;
        System.out.println(ArraySearching.binarySearch(arr,key));
    }
}
