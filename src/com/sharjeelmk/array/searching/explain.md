# Linear Search
### Problem: Given an array arr[] of n elements, write a function to search a given element x in arr[].
### Examples :  
```
Input : arr[] = {10, 20, 80, 30, 60, 50, 
                     110, 100, 130, 170}
          x = 110;
Output : 6
Element x is present at index 6

Input : arr[] = {10, 20, 80, 30, 60, 50, 
                     110, 100, 130, 170}
           x = 175;
Output : -1
Element x is not present in arr[].
```

A simple approach is to do a linear search, i.e  
* Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
* If x matches with an element, return the index.
* If x doesn’t match with any of elements, return -1.

### Time Complexcity of Linear Search O(n) 

<p align="center"> 
<a href="#"><img width="50%" height="auto" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/Linear-Search.png" height="175px"/></a>
</p>

## Binary Search
A binary search is an advanced type of search algorithm that finds and fetches data from a sorted list of items. Its core working principle involves dividing the data in the list to half until the required value is located and displayed to the user in the search result. Binary search is commonly known as a half-interval search or a logarithmic search.

### How Binary Search Works?
* The search process initiates by locating the middle element of the sorted array of data
* After that, the key value is compared with the element
* If the key value is smaller than the middle element, then searches analyses the upper values to the middle element for comparison and matching
* In case the key value is greater than the middle element then searches analyses the lower values to the middle element for comparison and matching

<p align="center"> 
<a href="#"><img width="50%" height="auto" src="https://www.geeksforgeeks.org/wp-content/uploads/Binary-Search.png" height="175px"/></a>
</p>