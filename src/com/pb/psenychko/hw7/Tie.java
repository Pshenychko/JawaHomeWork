package com.pb.psenychko.hw7;

public class Tie extends Clothes implements ManClothes{
    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Man tries on Tie Size:" + super.size.getEuroSize() + " price:" + super.price + " color:" + super.color);

    }
}
