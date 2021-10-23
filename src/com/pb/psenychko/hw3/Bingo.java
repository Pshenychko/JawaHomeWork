package com.pb.psenychko.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int x = random.nextInt(101);
        int n = 1;
        for(;;) {
            System.out.println("enter digit between 0 and 100 or Enter 101 to end");
            int a = scan.nextInt();
            if (a == 101) {System.out.println("See you next time)"); break;}
            if (a <0 || a >101) System.out.println("The value is not allowed"); else {
            if (a==x) {
                System.out.println("Congratulations! you guessed the digit! It took " + n + " attempts");
                break;
            }
            if (a<x) {
                    System.out.println("Your digit is smaller. Try your luck again!");
            } else
            {
                System.out.println("Your digit is bigger. Try your luck again!");
            }
            n++;
        }   }
        }
}
