package com.company;

public class Cat extends Animal implements Pet{
    String nombre = "gato";

    public Cat(String nombre) {
        super(4);
        this.nombre = nombre;
    }

    public Cat(){
        this("");
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
        System.out.println(nombre + " está jugando con los naipes");
    }

    @Override
    public void eat() {
        System.out.println(nombre + " come ratones");
    }

    @Override
    public void walk() {

    }


}
