/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (sortedArray[mid] < key) {
                low = mid + 1;
            } else if (sortedArray[mid] > key) {
                high = mid - 1;
            } else if (sortedArray[mid] == key) {
                index = mid;
                break;
            }
        }
        return index;
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 4;
        int low = 0;
        int high = arr.length;
        int index = runBinarySearchIteratively(arr,key,low,high);
        System.out.println(index);
    }
    //The time analysis for the above algorithm is O(Log(n)), because it is an iterative binary search.
    //The space complexity is O(1) because the best case would be it finds it right away.
}
