package com.pb.artjukh.hm10;

public class NumBox <T extends Number> {
    private final T[] arr;
    int max = 2;
    int size = 2;

    public NumBox(int size, int max) {
        arr = (T[]) new Number[size];
        this.max = max;
        this.size = size;
    }

    public T get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }

    public double sum() {
        double sum = 0.0;
        for (T i : arr) {
            sum += i.doubleValue();
        }
        return sum;
    }

    public void add(int index, T arr) throws Exception {
        {
            try {
                this.arr[index] = arr;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Количесвто элементов больше заданного обьема массива");
            }
        }
    }

    public T max() {
        T maxValue = this.get(0);
        for (int i = 0; i < this.size; i++) {
            if (this.get(i).doubleValue() > maxValue.doubleValue())
                maxValue = this.get(i);
        }
        return maxValue;
    }

    public double average() {
        double average = 0;
        double sum = 0.0;
        for (T i : arr) {
            sum += i.doubleValue();
        }
        average = sum / this.size;

        return average;
    }
}





