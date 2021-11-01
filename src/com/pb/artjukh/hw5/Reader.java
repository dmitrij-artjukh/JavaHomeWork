package com.pb.artjukh.hw5;

import java.util.Locale;

public class Reader {
    private String fio;
    private Integer id;
    private String faculty;
    private String date;
    private String phone;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void takeBook(Integer number)
    {
       System.out.println("Петров взял книг:"+number);
    }
    public void  takeBook (String book){

    System.out.print(book+", ");
    }


    public void takeBook (String title, String author, String year)
            {
        System.out.print(title+" ("+author+year+"), " );

    }

    public void returnBook(Integer number)
    {
        System.out.println("Петров вернул книг:"+number);
    }
    public void  returnBook (String book){

        System.out.print(book+", ");
    }


    public void returnBook (String title, String author, String year)
    {
        System.out.print(title+" ("+author+year+"), " );

    }





}





