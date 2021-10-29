package com.pb.psenychko.hw4;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static String EnterString() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }

    static boolean isAnagram(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s2,s1);
    }

    public static void main(String[] args) {
        System.out.println("Enter first string");
        String str1 = EnterString();
        System.out.println("Enter second string");
        String str2 = EnterString();
        if(isAnagram(str1,str2)) {
            System.out.println("It is an Anagram");
        } else {
            System.out.println("It is not an Anagram");
        }
    }
}
