/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if (a[inner] > a[inner+1]) {
                    temp = a[inner];
                    a[inner] = a[inner+1];
                    a[inner+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        bubbleSort(arr,arr.length);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    //The worst case time complexity is O(n^2), where for every number that is out of order another pass is needed, and it is in a nested for loop.
    
    
}
