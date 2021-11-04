package com.pb.psenychko.hw6;

public class Veterinarian {

    public Veterinarian() {
    }

    public void treatAnimal(Animal animal) {
        System.out.println("Animal from " + animal.getLocation() + " has food " + animal.getFood());
    }
}
