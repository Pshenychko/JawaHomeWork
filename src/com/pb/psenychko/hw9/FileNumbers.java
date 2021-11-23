package com.pb.psenychko.hw9;

import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileNumbers {
    public static void main(String[] args) throws IOException {
        try {
            crateNumbersFile();
            createOddNumbersFile();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void crateNumbersFile() throws IOException {
        Path path = Files.createFile(Paths.get("C:\\Users\\Олександр\\IdeaProjects\\JawaHomeWork\\src\\com\\pb\\psenychko\\hw9\\numbers.txt"));
        Random r = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int i = 0; i < 100; i++) {
                if(i%10 == 0 && i != 0) {
                    writer.newLine();
                    writer.write(r.nextInt(100) + " ");
                }  else writer.write(r.nextInt(100) + " ");
            }
        }

    }

    public static void createOddNumbersFile() throws IOException {
        Path path = Paths.get("C:\\Users\\Олександр\\IdeaProjects\\JawaHomeWork\\src\\com\\pb\\psenychko\\hw9\\numbers.txt");
        try {
            Scanner scanner = new Scanner(path);
            int n = 0;
            while (scanner.hasNextInt()) {
                n++;
                scanner.nextInt();
            }
            int[] bb = new int[n];
            Scanner scan = new Scanner(path);
            for (int i = 0; i < bb.length; i++) {
                bb[i] = scan.nextInt();
            }
            for (int i = 0; i < bb.length; i++) {
                if (bb[i] % 2 == 0)
                    bb[i] = 0;
            }

            Path secondPath = Files.createFile(Paths.get("C:\\Users\\Олександр\\IdeaProjects\\JawaHomeWork\\src\\com\\pb\\psenychko\\hw9\\odd-numbers.txt"));
            try (BufferedWriter w = Files.newBufferedWriter(secondPath)) {
                for (int i = 0; i <= bb.length - 1; i++) {
                    if (i % 10 == 0 && i != 0) {
                        w.write(bb[i] + " ");
                        w.newLine();
                    }
                    else
                        w.write(bb[i] + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
