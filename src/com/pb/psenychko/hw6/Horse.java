package com.pb.psenychko.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private float speed;

    public Horse(String food, String location, float speed) {
        super(food, location);
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public void makeNoise() {
        System.out.println("Horse makes noise");
    }

    @Override
    public void eat() {
        System.out.println("Horse eats");
    }

    @Override
    public void sleep() {
        System.out.println("Horse is sleeping");
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Horse)) return false;
        if (!super.equals(o)) return false;
        Horse horse = (Horse) o;
        return Float.compare(horse.getSpeed(), getSpeed()) == 0;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpeed());
    }

    @Override
    public String toString() {
        return "Horse{" +
                "speed=" + speed +
                '}';
    }
}
