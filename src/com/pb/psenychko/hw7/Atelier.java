package com.pb.psenychko.hw7;

public class Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = new Clothes[4];
        clothes[0] = new Tshirt(Size.S, 123, "red");
        clothes[1] = new Tie(Size.M, 653, "white");
        clothes[2] = new Pants(Size.M, 654, "green");
        clothes[3] = new Skirt(Size.XXS, 66, "pink");
        dressMan(clothes);
        dressWomen(clothes);

    }

    static void dressMan(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if(c instanceof ManClothes) {
                ((ManClothes) c).dressMan();
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        for(Clothes c: clothes) {
            if(c instanceof WomanClothes) {
                ((WomanClothes) c).dressWoman();
            }
        }
    }
}
