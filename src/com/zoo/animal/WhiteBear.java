package com.zoo.animal;

import com.zoo.animal.action.MovingAnimal;
import com.zoo.animal.exception.WrongMeetException;

public class WhiteBear extends Animal{
    public WhiteBear(String name, String existencePeriod, String classAnimal, Integer size) {
        super(name, existencePeriod, classAnimal, size);
    }

    public WhiteBear() {
    }

    @Override
    public void toPal(Animal animal) {

    }

    @Override
    public void lifeSpan() {
        System.out.println("30 years");

    }

    @Override
    public void eat() {
        System.out.println("I am eating food");

    }

    @Override
    public void sleep() {
        System.out.println("I am sleeping every day");

    }

    @Override
    public void move() {
        System.out.println( this.getName() + " can move");

    }

    @Override
    public void toPal() {

    }

    @Override
    public void move(Animal name) {

    }

    @Override
    public void jump(Animal name) {

    }
}

