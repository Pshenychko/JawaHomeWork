package com.pb.psenychko.hw7;

public class Pants extends Clothes implements ManClothes{
    public Pants(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man tries on Pants Size:" + super.size.getEuroSize() + " price:" + super.price + " color:" + super.color);
    }
}
