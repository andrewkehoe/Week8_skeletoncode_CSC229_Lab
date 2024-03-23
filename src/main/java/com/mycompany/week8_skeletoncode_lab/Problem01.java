/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static boolean isPrime(int n) {
        if (n==0 || n==1) {return false;}
        for(int i = n-1; i>1; i--) {
            if (n%i==0) {return false;}
        }
        return true;
    }
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time
    public static long getSumOfPrimes(int n){
        if (n<=0) {return 0;}
        else {
            if (isPrime(n)) {return n+=getSumOfPrimes(n-1);};

        }
        return getSumOfPrimes(n-1);
    }

    public static void main(String[] args) {
        int num = 7;
        System.out.println(getSumOfPrimes(num));
    }

    //The best and worst complexity is O(n). It will go through every number from n to 1 and add them if necessary, but still pass if not. There are loops but they are not nested.

    
}
