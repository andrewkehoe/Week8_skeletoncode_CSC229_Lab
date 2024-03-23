/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {

    public static int search(int arr[], int x)
    {
        int n = arr.length;
        // Todo 01: - complete the implementation of linear search and test your code  
        //         - prvoide asymptotic analysis of the developed solution
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,2,4};
        int target = 5;
        int pos = search(nums, target);
        System.out.println(pos);
    }
    //The worst case scenario in this case is O(n) if n is the length of arr[].
    //In other words if the element is not found or is in the last position, it will go through all of it.
    //The best case is that it is in the first position, and will be O(1).
}
