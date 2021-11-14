package com.pb.psenychko.hw7;

public class Tshirt extends Clothes implements WomanClothes{
    public Tshirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Woman tries T-shirt on Size:" + super.size.getEuroSize() + " price:" + super.price + " color:" + super.color);
    }
}
