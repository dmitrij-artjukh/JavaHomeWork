package com.pb.artjukh.hw6new;

public class Veterinarian {

    public void treatAnimal(Animal animal){

        System.out.println("На прием пришли животное " + animal.getName() +
                ", который живет в  " + animal.getLocation() +"(/e)," + " он питаеться  " + animal.getFood()+"(/ом)");

    }


}
