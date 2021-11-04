package com.pb.psenychko.hw6;

import java.util.Objects;

public class Dog extends Animal{

    public int boneCount;

    public Dog(String food, String location, int boneCount) {
        super(food, location);
        this.boneCount = boneCount;
    }

    public int getBoneCount() {
        return boneCount;
    }

    public void setBoneCount(int boneCount) {
        this.boneCount = boneCount;
    }

    @Override
    public void makeNoise() {
        System.out.println("Dog makes noise");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return getBoneCount() == dog.getBoneCount();
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getBoneCount());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "boneCount=" + boneCount +
                '}';
    }
}
