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
//        BufferedReader in = new BufferedReader(new FileReader("numbers.txt"));
//        String s = in.readLine();
//        String[] strScores = s.split(" ");
////        int[] score = new int[strScores.length];
//        for (int j = 0; j < strScores.length; j++) {
//            score[j] = Integer.parseInt(strScores[j]);
//        }
        try (Scanner in = new Scanner(new File("numbers.txt")); // "try с ресурсами"
             PrintWriter out = new PrintWriter(new FileWriter("out_file.txt"));) {
            System.out.println("Вывод, с учетом замены целых четных чисел на '0':");
            while (in.hasNextLine()) {
                Scanner line = new Scanner(in.nextLine()); // Одна строка файла
                while (line.hasNextInt()) {             // Разберем ее на числа
                    int data = line.nextInt();          // Очередное число
                    if (data % 2 == 0) {                // Если чётное
                        System.out.format("%d -> 0, ", data); // Чтоб было видно, что делается
                        data = 0;                       // Заменим его нулём
                    } else
                        System.out.print(data + ", ");  // Чтоб было видно, что делается
                    out.print(data + ", ");
                }
                line.close();                   // Не забывать, чтобы не было утечек
                out.println();                  // Строка закончена -- перенос строки в вых. файл
                System.out.println();           // и на экране
            }
        } catch (IOException x) { System.out.println("IO error: " + x); }
        // И всё. Файлы закрыты
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
