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
}
