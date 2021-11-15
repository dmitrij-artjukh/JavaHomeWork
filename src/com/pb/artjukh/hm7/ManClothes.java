package com.pb.artjukh.hm7;

public interface ManClothes {
    static void dressMan (Clothes[] clothes) {

        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
            System.out.println(clothe);
            }
        }

    }
}

