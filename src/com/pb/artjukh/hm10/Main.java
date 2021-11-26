package com.pb.artjukh.hm10;

public class Main {
    public static void main(String[] args) throws Exception {

        NumBox<Integer> numbers = new NumBox<>(2,2);
        numbers.add(0, new Integer(11));
        Integer int0 = numbers.get(0);
        numbers.add(1, new Integer(12));
        Integer int1 = numbers.get(1);

        NumBox<Float> numbers2 = new NumBox<Float>(2,5);
        numbers2.add(0, new Float(2.2));
        numbers2.add(1, new Float(2.3));

        NumBox<Double> numbers3 = new NumBox<Double>(2,6);
        numbers3.add(0, new Double(3.3));
        numbers3.add(1, new Double(3.4));
         NumBox q = new NumBox(1,1);
        //numbers3.add(2, new Double(3.4));
        System.out.println("Длинна"+numbers.length());

        int index = (int) (Math.random()*numbers.length());
        System.out.println("Значение елемента "+(index+1)+" равно "+numbers.get(index));





    }
//    public static void show(NumBox<?> box){
//        System.out.println(box);
//        System.out.println("Сумма: "+box.sum());
//        System.out.println("Размер "+box.length());
//        System.out.println("Среднее значение " +box.average());
//        int index = (int) (Math.random()*box.length());
////        System.out.println("Значение елемента "+(index+1)+" равно "+box.get(index));
//        System.out.println("Максимум "+box.max());
//    }

}
