package com.zoo.animal;

import com.zoo.animal.action.MovingAnimal;

import java.util.Objects;

public abstract class  Animal implements MovingAnimal {
    private String name;
    private String existencePeriod;
    private String classAnimal;
    private Integer size;

    public Animal(String name, String existencePeriod, String classAnimal, Integer size) {
        this.name = name;
        this.existencePeriod = existencePeriod;
        this.classAnimal = classAnimal;
        this.size = size;
    }


    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getExistencePeriod() {

        return existencePeriod;
    }

    public void setExistencePeriod(String existencePeriod) {

        this.existencePeriod = existencePeriod;
    }

    public String getClassAnimal() {

        return classAnimal;
    }

    public void setClassAnimal(String classAnimal) {

        this.classAnimal = classAnimal;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {

        this.size = size;
    }
    public void emittedSound(){

        System.out.println("roar");
    }

     public abstract void lifeSpan();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return existencePeriod.equals(animal.existencePeriod) &&
                classAnimal.equals(animal.classAnimal) &&
                size.equals(animal.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(existencePeriod, classAnimal, size);
    }


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", existencePeriod='" + existencePeriod + '\'' +
                ", classAnimal='" + classAnimal + '\'' +
                ", size=" + size +
                '}';

    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void move();
    public abstract void toPal();



    public Animal() {
    }

    public Animal(String existencePeriod) {
        this.existencePeriod = existencePeriod;
    }


    public abstract void toPal(Animal animal);
}
