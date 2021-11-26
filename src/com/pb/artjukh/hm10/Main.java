package com.pb.artjukh.hm10;

public class Main {
    public static void main(String[] args) throws Exception {


        NumBox<Integer> numbers = new NumBox<>(2, 2);
        numbers.add(0, new Integer(11));
        numbers.add(1, new Integer(12));
        numbers.add(2, new Integer(12));

        NumBox<Float> numbers2 = new NumBox<Float>(2, 5);
        numbers2.add(0, new Float(2.2));
        numbers2.add(1, new Float(2.3));


        System.out.println("***************массив Integer******");
        System.out.println("Сумма: " + numbers.sum());
        System.out.println("Размер" + numbers.length());
        int index = (int) (Math.random() * numbers.length());
        System.out.println("Значение елемента " + (index + 1) + " равно " + numbers.get(index));
        System.out.println("Максимум " + numbers.max());
        System.out.println("Среднее значение " + numbers.average());
        System.out.println("***************массив Float******");
        System.out.println("Сумма: " + numbers2.sum());
        System.out.println("Размер" + numbers2.length());
        int index2 = (int) (Math.random() * numbers2.length());
        System.out.println("Значение елемента " + (index2 + 1) + " равно " + numbers2.get(index));
        System.out.println("Максимум " + numbers2.max());
        System.out.println("Среднее значение " + numbers2.average());
    }
}
