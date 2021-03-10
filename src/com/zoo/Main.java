package com.zoo;

import com.zoo.animal.*;

public class Main {

    public static void main(String[] args) {
        Animal WhiteBear = new WhiteBear("Bear", "now", "mammals", 3);
        Animal BlueWhale = new BlueWhale("Whale", "now", "mammals", 33);
        Animal IndianElephant = new IndianElephant("Elephant", "now", "mammals",
                3);
        Animal MarsupialWolf = new MarsupialWolf("Wolf", "not exist", "mammals",
                1);
        Animal Tardigrade = new Tardigrade("TardigradeX", "now", "arthropod", 0);
        Animal WildOx = new WildOx("Ox", "not exist", "mammals", 2);
        Animal Tyrannosaur = new Tyrannosaur("Rex","not exist", "Reptiles",
                13);

        System.out.print("Bear says ");
        WhiteBear.emittedSound();
        System.out.print("Whale says ");
        BlueWhale.emittedSound();
        System.out.print("Elephant says ");
        IndianElephant.emittedSound();
        System.out.print("Wolf says ");
        MarsupialWolf.emittedSound();
        System.out.print("TardigradeX says ");
        Tardigrade.emittedSound();
        System.out.print("Ox says ");
        WildOx.emittedSound();
        System.out.print("Rex says ");
        Tyrannosaur.emittedSound();
        WhiteBear.move();
        System.out.println("Bear exist " + WhiteBear.getExistencePeriod());
        System.out.println("TardigradeX exist " + Tardigrade.getExistencePeriod());
        System.out.println("Rex exist " + Tyrannosaur.getExistencePeriod());
        System.out.println("Ox size is " + WildOx.getSize()+ " meters");
        WildOx.sleep();
        IndianElephant.eat();
        System.out.println("Bear nature class is " + WhiteBear.getClassAnimal());
        System.out.print("Bear can live ");
        WhiteBear.lifeSpan();
        System.out.print("Rex can live ");
        Tyrannosaur.lifeSpan();
        System.out.print("TardigradeX can live ");
        Tardigrade.lifeSpan();
        System.out.print("Whale can ");
        BlueWhale.move(BlueWhale);
        System.out.print("TardigradeX  ");
        Tardigrade.jump(Tardigrade);
        System.out.print("MarsupialWolf ");
        MarsupialWolf.toPal(Tardigrade);
        System.out.print("TardigradeX and Ox ");
        Tardigrade.toPal(WildOx);
        System.out.print("Whale and Elephant ");
        BlueWhale.toPal(IndianElephant);






    }

}
