package com.pb.artjukh.hm7;

public  class Tie extends Clothes implements ManClothes {
    private final String name="Галстук";
    public Tie(Size size, Integer price, String color) {
        super(size, price, color);
    }
    public String toString() {
        return "Галстук:" +
                "размер=" + size+"/"+size.getEuroSize()+", " +size.getDescription()+
                ", цена=" + price +"$"+
                ", цвет='" + color ;
    }
}
