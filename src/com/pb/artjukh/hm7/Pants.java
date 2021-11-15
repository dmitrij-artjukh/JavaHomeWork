package com.pb.artjukh.hm7;

public  class Pants extends Clothes implements WomenClothes,ManClothes{

    public Pants(Size size, Integer price, String color) {
        super(size, price, color);


    }

    @Override
    public String toString() {
        return "Штаны:" +
                "размер=" + size+"/"+size.getEuroSize()+", " +size.getDescription()+
                ", цена=" + price +"$"+
                ", цвет='" + color ;
    }
}
