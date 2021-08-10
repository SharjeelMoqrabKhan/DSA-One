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
    /* Swapping two number without any third variable by using XOR operator */
    public static void swapTwoNumber(int a,int b){
        System.out.println("Swap before values a:"+a); //5->  101
        System.out.println("Swap before values b:"+b); //6->  110
        a=a^b; //  011-> 3
        b=a^b; //  101-> 5
        a=a^b;//   110-> 6
        System.out.println("Swap after values a:"+a);
        System.out.println("Swap after values b:"+b);
    }
}
