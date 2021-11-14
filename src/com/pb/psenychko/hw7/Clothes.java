package com.pb.psenychko.hw7;

public abstract class Clothes {
    protected Size size;
    protected int price;
    protected String color;

    public Clothes(Size size, int price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }
}
