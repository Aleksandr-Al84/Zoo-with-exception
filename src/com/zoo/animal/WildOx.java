package com.zoo.animal;

public class WildOx extends Animal{
    public WildOx(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("Muuuu");
    }

    @Override
    public void lifeSpan() {
        System.out.println("20 years");
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {
        System.out.println("Ox sleep too seldom");

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
