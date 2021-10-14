package com.pb.psenychko.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter digit between 0 and 100");
        int a = scan.nextInt();

        if (a<0 || a>100) { System.out.println("no no no"); } else {
        if (a<=14) {System.out.println("0-14");} else {
            if(a<=35) {System.out.println("15-35");} else {
                if(a<=50) {System.out.println("36-50");} else {
                    System.out.println("51-100");
                }
        }
        }
    }
    }
}
