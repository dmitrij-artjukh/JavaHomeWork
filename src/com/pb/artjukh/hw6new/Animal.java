package com.pb.artjukh.hw6new;

import java.util.Objects;

public class Animal {
    protected String food;
    protected String location;
    protected String name;
    public Animal(String name){
        this.name=name;
    }
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep (){
        System.out.println("спит");
    }

    public void eat ()
    {
        System.out.print("Питается:");

    }
    public void makeNoise ()
    {
        System.out.print("Сейчас ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food) && Objects.equals(location, animal.location) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


}
