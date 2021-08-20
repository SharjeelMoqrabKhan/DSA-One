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

    // Binary Search
    public static int binarySearch(int [] arr, int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return arr[mid];
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
}
