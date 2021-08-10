package com.sharjeelmk.bitManipulation;

public class BitManipulation {
    /* Even or Odd by using & operator (110&1) if zero even otherwise odd */
    public static void evenOdd(int num){
        if((num&1)==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
