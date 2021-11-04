package com.pb.psenychko.hw6;
import java.lang.reflect.Constructor;

public class VetClinic {

    public static void main(String[] args) throws  Exception{
        Animal[] ans = new Animal[3];

       // Class compClazz = Class.forName("hw6.Veterinarian");
       // Constructor c = compClazz.getConstructor(new Class[] {String.class});

        Veterinarian vet = new Veterinarian();

        ans[0] = new Cat("Milk", "LA", 3);
        ans[1] = new Dog("Meat", "Ukraine", 5);
        ans[2] = new Horse("Salt", "Poland", 45.4f);

        for(Animal a: ans) {
            vet.treatAnimal(a);
        //    Object vet = c.newInstance();
        //    ((Veterinarian) vet).treatAnimal(a);
        }
    }
}
