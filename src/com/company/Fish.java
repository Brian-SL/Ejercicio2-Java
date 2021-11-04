package com.company;

public class Fish extends Animal implements Pet{
    private String nombre= "Nemo";

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println(nombre + " come peces");
    }

    @Override
    public void walk() {
        System.out.println(nombre + " no camina porque no tiene patas");
    }

    @Override
    public String getName() {
        return nombre;
    }

    @Override
    public void setName(String name) {
        this.nombre = name;
    }

    @Override
    public void play() {
        System.out.println(nombre + " no juega");
    }
}
