package hm10;

public class NumBox <T extends Number> {
    private final T[] arr;
 int max =5;



    public NumBox(int size, int max) {
        arr = (T[]) new Number[size];
        this.max = max;
    }

    public T get(int index) {
        return arr[index];
    }
    public int  length(){
        return arr.length;
    }
//    private double sum(){
//        return null;
//    }
    public void add(int index, T arr)throws Exception { {
        try {
            this.arr[index] = arr;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Значение больше заданного обьема");
        }
        }

    }






}










//    void add(T t) throws Exception {
//            if(this.filled >= this.number.length){
//                throw new Exception("Array already filled!");
//            }
//            this.number[this.filled] = t;
//            this.filled++;
//        }






//    public T max(){
//        T maxValue = arr.get();
//        for (int i =0;i<arr.size; i++){
//            if (maxValue instanceof  Integer)
//            {
//                if ((int) arr.get(i)>(int)maxValue) maxValue=arr.get(i);
//            } else if (maxValue instanceof Float){
//                if ((float) arr.get(i)>(float) maxValue) maxValue=arr.get(i);
//            } else if  (maxValue instanceof Double){
//                if ((double) arr.get(i)>(double) maxValue) maxValue=arr.get(i);
//            }
//        }
//        return maxValue;
//    }
//        void add(T t) throws Exception {
//            if(this.filled >= this.numbers.length){
//                throw new Exception("Array already filled!");
//            }
//            this.numbers[this.filled] = t;
//            this.filled++;
//        }


//        public double sum () {
//            double sum = 0.0;

//        for (T i: arr)
//        {
//            sum+=i.doubleValue();
//        }
//        return sum;



        //демонтарция
//    public static void show(NumBox<?> box){
//        System.out.println(box);
//        System.out.println("Сумма: "+box.sum());
//        System.out.println("Размер "+box.length());
//        System.out.println("Среднее значение " +box.average());
//        int index = (int) (Math.random()*box.length());
//        System.out.println("Значение елемента "+(index+1)+" равно "+box.get(index));
//        System.out.println("Максимум "+box.max());
//    }

