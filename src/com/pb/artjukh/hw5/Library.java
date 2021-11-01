package com.pb.artjukh.hw5;


import java.util.Arrays;


public class Library {
    public static void main(String[] args) {

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.setTitle("Приключения");
        book1.setAuthor("Иванов И. И.");
        book1.setYear("2000г");

        book2.setTitle("Словарь");
        book2.setAuthor("Сидоров А. В.");
        book2.setYear("1980 г");

        book3.setTitle("Энциклопедия");
        book3.setAuthor("Гусев К. В.");
        book3.setYear("2010г.");

        Reader reader1 = new Reader();
        reader1.setFio("Петров");

        Book[] books = {book1, book2, book3};

        //1
        reader1.takeBook(3);
        //2
        System.out.print(reader1.getFio() + " взял книги:");
        for (int x = 0; x < 3; x++) {
            reader1.takeBook(books[x].getTitle());
        }
        System.out.println();
        //3
        System.out.print(reader1.getFio() + " взял книги:");
        for (int x = 0; x < 3; x++) {
            reader1.takeBook(books[x].getTitle(), books[x].getAuthor(), books[x].getYear());
        }

        //1
        System.out.println();
        reader1.returnBook(3);
        //2
        System.out.print(reader1.getFio() + " вернул книги:");
        for (int x = 0; x < 3; x++) {
            reader1.returnBook(books[x].getTitle());
        }
        System.out.println();
        //3
        System.out.print(reader1.getFio() + " вернул книги:");
        for (int x = 0; x < 3; x++) {
            reader1.returnBook(books[x].getTitle(), books[x].getAuthor(), books[x].getYear());

            // Reader reader1= new Reader("Петров",0, "физмат","11/10/2011","08008080");
            //   Book [] books = new Book[3];
            //    books[0]=new Book ("Приключения ","Иванов И. И.",2000);
            //   books[1]=new Book ("Словарь","Сидоров А. В ",1980 );
            //  books[2]=new Book("Энциклопедия ","Гусев К. В.",2010);

        }

    }
    }


