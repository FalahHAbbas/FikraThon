package com.me;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int len = new Scanner(System.in).nextInt();
        int[] init = new int[len];
        for (int i = 0; i < len; i++) {
            init[i] = i+1;
        }
        round(init);
    }

    private static void round(int[] arr) {
        if (arr.length == 1) {
            System.out.println("arr = " + arr[0]);
            return;
        }
        int[] newArr = new int[arr.length / 2];
        if (arr.length % 2 == 0) {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    newArr[c++] = arr[i];
                }
            }
        } else {
            int c = 0;
            for (int i = 1; i < arr.length; i++) {
                if (i % 2 != 0) {
                    newArr[c++] = arr[i+1];
                }
            }
        }
        round(newArr);
    }
}
