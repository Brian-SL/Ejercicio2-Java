package com.company;

public class TestAnimal {

    public static void main(String[] args) {
        Fish f = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Cat p = new Cat("gato");

        f.eat();
        f.play();
        f.walk();
        System.out.println("");
        c.eat();
        c.play();
        System.out.println("");
        a.eat();
        a.walk();
        System.out.println("");
        e.eat();
        e.walk();
        System.out.println("");
        p.play();
    }
}
