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
    public static void nonRepeatingElement2(int [] arr){
        int res=0;
        //Taking xor of all
        for (int j : arr) {
            res = res ^ j;
        }
        //taking right most set bit for segregation
        int rmsb= res & -res;
        // X will responding for rmsb unset
        // Y will responding for rmsb set
        int x=0;
        int y=0;
        for (int i : arr) {
            if ((i & rmsb) == 0) {
                x = x ^ i;
            } else {
                y = y ^ i;
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
