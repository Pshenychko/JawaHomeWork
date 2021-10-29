package com.pb.psenychko.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter Value number " + (i+1));
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    arr[i] += arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] -= arr[j];
                }
            }
        }

        int sum = 0;
        int pos = 0;

        System.out.println("Result:");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0) {
                pos++;
            }
            sum+= arr[i];
            System.out.print(arr[i] + " ");
        }

        System.out.println("sum of elements is " + sum);
        System.out.println("count of positive is " + pos);
    }
}
