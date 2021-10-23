package com.pb.psenychko.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length - 1; i++) {
            System.out.println("Enter Value number " + i+1);
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i+1; j < arr.length - 1; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] += arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] -= arr[j];
                }
            }
        }

        System.out.println("Result:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
