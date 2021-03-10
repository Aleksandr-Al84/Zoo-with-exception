package com.zoo.animal;

public class IndianElephant extends Animal{
    public IndianElephant(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("infrasound");
    }

    @Override
    public void lifeSpan() {
        System.out.println("48 years");

    }

    @Override
    public void eat() {
        System.out.println("Elephant eat only grass");

    }

    @Override
    public void sleep() {

    }

    @Override
    public void move() {

    }

    @Override
    public void toPal() {

    }

    @Override
    public void toPal(Animal animal) {

    }

    @Override
    public void move(Animal name) {

    }

    @Override
    public void jump(Animal name) {

    }
}
