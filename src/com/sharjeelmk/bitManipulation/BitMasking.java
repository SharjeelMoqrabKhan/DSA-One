package com.sharjeelmk.bitManipulation;

public class BitMasking {
    /** Find the ith bit is set or not
     * set = 1, non set = 0
     * suppose we have n=8-> 1000 ,the bits start form zero and we want
     * to find 4 bit which is 4-1=3 cause zero based for that we make mask and then
     * and if non zero means bits is set
     * mask(1<<ith-bit)
     * */
    public static boolean getBit(int n,int i){
        return ((n&(1<<i))!=0);
    }

    /** set the ith bit set means make bit 1 if it's 0
     * for that we if we have number 8-> 1000 and its zero's bit unset
     * and we want to set it we have mask it 1<<i and then OR with number
     * suppose we want to set zero's bit
     * num | 1<<i != 0 means set
     * */
    public static boolean setBit(int n, int i){
        return ((n|(1<<i))!=0);
    }
}
