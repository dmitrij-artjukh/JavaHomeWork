package com.pb.artjukh.hw9;

import com.pb.artjukh.hm3.Array;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class FileNumbers {

    public static void createNumbersFile() throws IOException {

        //Path testFile1 = Files.createFile(Paths.get("numbers.txt"));
        //System.out.println(Files.exists(Paths.get("numbers.txt")));
        Path path = Paths.get("numbers.txt");

        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int n = 0; n < 10; n++) {
                for (int i = 0; i < 10; i++) {
                    int line = random.nextInt(100);
                    writer.write(line + " ");
                }
                writer.newLine();
            }
        }
    }

    public static void createOddNumbersFile() throws IOException {
    }
         public static void main (String[] args){
        try {
            createNumbersFile();
            createOddNumbersFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
