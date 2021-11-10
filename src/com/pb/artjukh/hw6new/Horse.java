package com.pb.artjukh.hw6new;

import java.util.Objects;

public class Horse extends Animal{
    private String Harness ;
public Horse (String name,String Harness){
    super(name);
    this.Harness=Harness;
}

    public String getHarness() {
        return Harness;
    }

    public void setHarness(String harness) {
        Harness = harness;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                ", name='" + name + '\'' +
                ", Harness='" + Harness + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Objects.equals(Harness, horse.Harness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Harness);
    }

    @Override
    public void sleep() {
        System.out.println(name+"Спит");

    }

    @Override
    public void eat() {
        System.out.println("питается сеном");
    }

    @Override
    public void makeNoise() {
      System.out.println("ржот");
    }
}
