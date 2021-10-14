package com.pb.psenychko.hw2;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter a");
        int operand1 = scan.nextInt();
        System.out.println("enter b");
        int operand2 =  scan.nextInt();
        System.out.println("what are you gonna do");
        String sing = scan.next();

        switch (sing) {
            case "/" :
                if (operand2 != 0) {
                    System.out.println("a/b=" + (operand1/operand2)); }
                 else { System.out.println("no no no"); }
                 break;
            case "*" :  System.out.println("a*b=" + (operand1*operand2)); break;
            case "+" :  System.out.println("a+b=" + (operand1+operand2)); break;
            case "-" :  System.out.println("a-b=" + (operand1-operand2)); break;
        }
    }
}
