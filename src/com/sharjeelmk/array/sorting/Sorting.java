package com.sharjeelmk.array.sorting;

public class Sorting {
    public static int [] bubbleSort(int [] arr){
    //counter is pass like 6 item we have to 5=6-1 and it will reduce for each pass;
    int counter=1;
    int temp;
    int n = arr.length;
    while (counter<n){
     for(int i=0; i<n-counter; i++){
         //checking two l>r if then swap
         if(arr[i]>arr[i+1]){
             temp=arr[i+1];
             arr[i+1]=arr[i];
             arr[i]=temp;
         }
     }
    counter++;
    }
    return arr;
}

    /* insertion sort is a simple sorting technique that works
     the way we sort playing cards in our hand, we chose one card
     and insert it its position (ascending or descending)
     Worst case O(n^2)
     */

    public static int [] insertionSort(int [] ar){
        for(int i=1; i<ar.length; i++){
            int temp = ar[i];
            int j = i-1;
            while (j>=0 && ar[j]>temp){
                ar[j+1]=ar[j];
                j--;
            }
            ar[j+1]=temp;
        }
        return ar;
    }

}
