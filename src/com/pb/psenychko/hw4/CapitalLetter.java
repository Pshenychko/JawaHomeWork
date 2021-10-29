package com.pb.psenychko.hw4;
import java.util.Scanner;

public class CapitalLetter {
    static String EnterString() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your string");
        String str = scan.nextLine();
        return str;
    }

    static StringBuilder UC(String str) {
        char[] chArray = str.toCharArray();
        StringBuilder result = new StringBuilder();

        if(chArray[0] != ' ')  {
            String x = Character.toString(chArray[0]).toUpperCase();
            result.append(x);
        }
        for (int i = 1; i <= chArray.length-1; i++) {
            if(chArray[i] == ' ') {
                result.append(' ');
                String x = Character.toString(chArray[i + 1]).toUpperCase();
                result.append(x);
                i++;
            } else  {
                String x = Character.toString(chArray[i]);
                result.append(x);
            }
        }
        return  result;
    }

    public static void main(String[] args) {
        String str = EnterString();
        System.out.println(UC(str));
    }
}

