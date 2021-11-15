package com.pb.artjukh.hm7;

public interface WomenClothes {
    static void dressWoman(Clothes[] clothes) {

        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}