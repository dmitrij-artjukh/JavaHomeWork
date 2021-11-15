package com.pb.artjukh.hm7;

public  class Tshirt extends Clothes implements ManClothes,WomenClothes{


    public Tshirt(Size size, Integer price, String color) {
        super(size, price, color);

    }

    @Override
    public String toString() {
        return "Футболка:" +
                "размер=" + size+"/"+size.getEuroSize()+", " +size.getDescription()+
                ", цена=" + price +"$"+
                ", цвет=" + color
                ;
    }
}
