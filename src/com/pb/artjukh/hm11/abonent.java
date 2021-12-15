package com.pb.artjukh.hm11;

import java.io.Serializable;
import java.time.LocalDate;

import java.util.Objects;

public class abonent  {

    private String name;
    private String phone;
    private String address;
    private LocalDate dateOfBirth;
    private String dateOfChange;


    public abonent(String name, String phone, String address, LocalDate dateOfBirth, String dateOfChange) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.dateOfChange = dateOfChange;
    }

    public abonent() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        abonent abonent = (abonent) o;
        return Objects.equals(name, abonent.name) && Objects.equals(phone, abonent.phone) && Objects.equals(address, abonent.address) && Objects.equals(dateOfBirth, abonent.dateOfBirth) && Objects.equals(dateOfChange, abonent.dateOfChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, address, dateOfBirth, dateOfChange);
    }


}
