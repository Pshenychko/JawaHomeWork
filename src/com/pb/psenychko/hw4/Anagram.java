package com.pb.psenychko.hw4;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    static String EnterString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    static boolean isAnagram(String str1, String str2) {
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        StringBuilder An1 = new StringBuilder();
        StringBuilder An2 = new StringBuilder();

        for(int i = 0; i < s1.length; i ++) {
            if(Character.isLetter(s1[i])) {
                String x;
                x = Character.toString(s1[i]);
                An1.append(x);
            }
        }

        for(int i = 0; i < s2.length; i ++) {
            if(Character.isLetter(s2[i])) {
                String x;
                x = Character.toString(s2[i]);
                An2.append(x);
            }
        }
        char[] an1 = An1.toString().toCharArray();
        char[] an2 = An2.toString().toCharArray();

        Arrays.sort(an1);
        Arrays.sort(an2);
        return Arrays.equals(an1,an2);
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
