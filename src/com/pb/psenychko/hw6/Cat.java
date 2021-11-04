package com.pb.psenychko.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private int milkLevel;

    public Cat(String food, String location, int milkLevel) {
        super(food, location);
        this.milkLevel = milkLevel;
    }

    public int getMilkLevel() {
        return milkLevel;
    }

    public void setMilkLevel(int milkLevel) {
        this.milkLevel = milkLevel;
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("Cat makes noise");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return getMilkLevel() == cat.getMilkLevel();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getMilkLevel());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "milkLevel=" + milkLevel +
                '}';
    }
}
