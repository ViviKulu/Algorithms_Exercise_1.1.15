package com.company;

import java.util.Random;

public class Main {

//    Write a static method histogram() that takes an array a[] of int values and
//    an integer M as arguments and returns an array of length M whose ith entry is the
//    number of times the integer i appeared in the argument array. If the values in a[] are all
//    between 0 and M–1, the sum of the values in the returned array should be equal to
//    a.length.

    public static void main(String[] args) {
        // write your code here
        int M = 10;
        Random rand = new Random(20);
        int x = 12;
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            int r = rand.nextInt(9);
            array[i] = r;
        }
        histogram(array, M);
    }

    public static void histogram(int[] a, int M) {
        int[] mArray = new int[M];
        for (int i = 0; i < M; i++) {
            mArray[i] = 0;
        }

        for (int j = 0; j < a.length; j++) {
            mArray[a[j]]++;
        }

        int sum = 0;
        for (int k = 0; k < M; k++) {
            sum += mArray[k];
            System.out.print(mArray[k] + " ");
        }
        System.out.println("Sum is " + sum + " and array length is " + a.length);
    }
}
