package com.pb.artjukh.hm7;

public  class Skirt extends Clothes implements WomenClothes{
    private final String name="Юбка";
    public Skirt(Size size, Integer price, String color) {
        super(size, price, color);
    }
    public String toString() {
        return "Юбка:{" +
                "размер=" + size+"/"+size.getEuroSize()+", " +size.getDescription()+
                ", цена=" + price +"$"+
                ", цвет='" + color ;
    }
}
