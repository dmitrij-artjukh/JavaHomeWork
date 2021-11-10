package com.pb.artjukh.hw6new;

import java.util.Objects;

public class Dog extends Animal{
private String color;

public Dog (String name, String color){
    super(name);
    this.color=color;
}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println(name+"сейчас спит");
    }

    @Override
    public void eat() {
        System.out.println("питается вискасом");
    }

    @Override
    public void makeNoise() {
        System.out.println("мурчит");
    }
}
