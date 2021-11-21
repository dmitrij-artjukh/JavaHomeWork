package com.pb.artjukh.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class FileNumbers {

    public static void createNumbersFile() throws IOException {

        Path path = Paths.get("numbers.txt");

        Random random = new Random();
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (int n = 0; n < 10; n++) {
                for (int i = 0; i < 10; i++) {
                    int line = random.nextInt(100);
                    writer.write(line + " ");
                }
                writer.newLine();
                writer.flush();
            }
        }

    }

    public static void createOddNumbersFile() throws IOException {
        try (Scanner in = new Scanner(new File("numbers.txt"));
             PrintWriter out = new PrintWriter(new FileWriter("odd-numbers.txt"));)

        {
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine());
                while (line.hasNextInt()) {
                    int data = line.nextInt();
                    if (data % 2 == 0) data = 0;
                    out.print(data + " ");

                }
                line.close();
                out.println();
                System.out.println();
            }

        } catch (IOException x) { x.getStackTrace() ;}

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
