package com.zoo.animal;

import com.zoo.animal.exception.WrongMeetException;

public class Tardigrade extends Animal{
    public Tardigrade(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    @Override
    public void emittedSound() {
        System.out.println("too quiet sound");
    }

    @Override
    public void lifeSpan() {
        System.out.println("200 years");
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
        try{
            if(animal instanceof WildOx){
                throw new WrongMeetException();
            }
            else System.out.println("I can meet with "+ animal.getName());
        }
        catch (WrongMeetException e){
            System.err.println("I can meet with animals, who exist now");
        }

    }

    @Override
    public void move(Animal name) {

    }

    @Override
    public void jump(Animal name) {
        System.out.println("Tiny jump ");

    }
}
