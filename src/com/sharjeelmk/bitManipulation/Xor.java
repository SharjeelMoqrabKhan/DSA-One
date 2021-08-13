package com.sharjeelmk.bitManipulation;

public class Xor {
    /*Find the non repeating element in
    array where every element repeating twice*/
    public static int nonRepeatingElement1(int [] arr){
    int res = 0;
        for (int j : arr) {
            res = res ^ j;
        }
    return res;
    }
}
