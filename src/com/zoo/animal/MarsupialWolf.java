package com.zoo.animal;

public class MarsupialWolf extends Animal{
    public MarsupialWolf(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("howl");
    }

    @Override
    public void lifeSpan() {
        System.out.println("14 years");
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
        System.out.println(this.getName()+ "Can friends " + animal.getName());

    }

    @Override
    public void move(Animal name) {

    }

    @Override
    public void jump(Animal name) {

    }
}
