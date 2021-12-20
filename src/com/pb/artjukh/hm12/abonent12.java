package com.pb.artjukh.hm12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class abonent12 {

    private String name;
    private String phone;
    private String address;
    private LocalDate dateOfBirth;
    private String dateOfChange;



    public abonent12(String name, String phone, String address, LocalDate dateOfBirth, String dateOfChange) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dateOfChange = dateOfChange;
    }

    public abonent12() {

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfChange() {
        return dateOfChange;
    }

    public void setDateOfChange(String dateOfChange) {
        this.dateOfChange = dateOfChange;
    }


    @Override
    public String toString() {
        return "abonent{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfChange='" + dateOfChange + '\'' +
                '}';
    }
}
