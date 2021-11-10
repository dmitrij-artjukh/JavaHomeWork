package com.pb.artjukh.hw6new;

import java.util.Objects;

public class Cat extends Animal{

    private String collar;

public Cat (String name, String collar ){
    super(name);
    this.collar=collar;
}

    public String getCollar() {
        return collar;
    }

    public void setCollar(String collar) {
        this.collar = collar;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(collar, cat.collar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collar);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", collar='" + collar + '\'' +
                '}';
    }

    @Override
    public void makeNoise() {
System.out.println("мурчит");

    }
    @Override
    public void eat() {
        System.out.println(name+"ест");
    }

    @Override
    public void sleep() {
       System.out.println(name+"спит");
    }
}
