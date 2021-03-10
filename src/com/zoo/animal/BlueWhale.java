package com.zoo.animal;

import com.zoo.animal.action.MovingAnimal;
import com.zoo.animal.exception.WrongMeetException;

public class BlueWhale extends Animal{
    public BlueWhale(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }


    @Override
    public void emittedSound() {
        System.out.println("whale song");
    }

    @Override
    public void lifeSpan() {
        System.out.println("80-90 years");
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
        if(animal instanceof IndianElephant){
            throw new WrongMeetException("Different areas of existence");
        }
        else System.out.println("Can meet again");
    }


    @Override
    public void move(Animal name) {
        System.out.println("Move under water");

    }

    @Override
    public void jump(Animal name) {

    }
}

