package com.pb.psenychko.hw10;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> numBox = new NumBox<>(3);
        Random r = new Random();
        for (;;) {
            try {
                numBox.add(r.nextInt(100));
            } catch (Exception e) {
                System.err.println("Oops. You are not allowed to add so much numbers");
                break;
            }
        }
        System.out.println("Average: " + numBox.average());
        System.out.println("Size: " + numBox.length());
        System.out.println("MAX: " + numBox.max());
        System.out.println("Sum: " + numBox.sum());
        System.out.println("Index: " + numBox.get(r.nextInt(3)));

        NumBox<Float> numBox1 = new NumBox<>(4);
        for (;;) {
            try {
                numBox1.add((float) r.nextInt(10000)/100);
            } catch (Exception e) {
                System.err.println("Oops. You are not allowed to add so much numbers");
                break;
            }
        }
        System.out.println("Average: " + numBox1.average());
        System.out.println("Size: " + numBox1.length());
        System.out.println("MAX: " + numBox1.max());
        System.out.println("Sum: " + numBox1.sum());
        System.out.println("Index: " + numBox1.get(r.nextInt(3)));
    }
}
