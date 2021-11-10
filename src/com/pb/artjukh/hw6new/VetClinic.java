package com.pb.artjukh.hw6new;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetClinic {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
         Dog dog = new Dog("рекс","черный");
         dog.setFood("мясо");
         dog.setLocation("будка");
         Cat cat = new Cat("Мурчик","антиблошиный");
         cat.setLocation("дом");
         cat.setFood("вискас");
         Horse horse =new Horse("Вегас","кожаная");
         horse.setLocation("сарай");
         horse.setFood("сено");

        Animal[] animals= new Animal[] {cat,dog,horse};
        cat.sleep();
        Class vetClazz1 = Class.forName("com.pb.artjukh.hw6new.Veterinarian");
        Constructor const1 = vetClazz1.getConstructor();
        Object obj = const1.newInstance();

        //String[] out = new String[animals1.length];
        if (obj instanceof Veterinarian) {
            for (int i = 0; i < animals.length; i++) {
                System.out.println(animals[i].toString());
                ((Veterinarian) obj).treatAnimal(animals[i]);
                System.out.println();
            }
        }

//dog.sleep();

    }
}
