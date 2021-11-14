package com.pb.psenychko.hw7;

public class Skirt extends Clothes implements WomanClothes{
    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman tries on Skirt Size:" + super.size.getEuroSize() + " price:" + super.price + " color:" + super.color);
    }


}
