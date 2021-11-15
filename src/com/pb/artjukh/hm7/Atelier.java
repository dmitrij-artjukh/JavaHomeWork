package com.pb.artjukh.hm7;

import com.pb.artjukh.hw6new.Veterinarian;

public class Atelier {
    public static void main(String[] args) {

        Clothes pant = new Pants(Size.XXS,10,"белый");
        Clothes tshirt = new Tshirt(Size.S,5,"коричневый");
        Clothes skirt = new Skirt(Size.M,15,"голубой");
        Clothes tie = new Tie(Size.L,5,"красный");

        Clothes clothes[]={pant,tshirt,skirt,tie};
        System.out.println("Мужская одежда:");
        ManClothes.dressMan(clothes);
        System.out.println("Женская одежда:");
        WomenClothes.dressWoman(clothes);

    }


}
