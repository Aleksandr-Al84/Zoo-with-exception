package com.zoo.animal;

public class Tyrannosaur extends Animal{
    public Tyrannosaur(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("Low rumble");
    }

    @Override
    public void lifeSpan() {
        System.out.println("30 years");

    }

    @Override
    public void eat() {

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
