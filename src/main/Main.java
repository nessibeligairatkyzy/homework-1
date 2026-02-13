package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.ArcherFactory;
import com.narxoz.rpg.factory.MageFactory;
import com.narxoz.rpg.factory.WarriorFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("=== RPG Character Creation with Factory Method ===\n");


        WarriorFactory warriorFactory = new WarriorFactory();
        Character warrior = warriorFactory.createCharacter("Тор");
        warrior.display();
        warrior.useSpecialAbility();

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        warrior.equipWeapon(medievalFactory.createWeapon());
        warrior.equipArmor(medievalFactory.createArmor());
        warrior.displayEquipment();

        System.out.println("\n---\n");

        MageFactory mageFactory = new MageFactory();
        Character mage = mageFactory.createCharacter("Гэндальф");
        mage.display();
        mage.useSpecialAbility();

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        warrior.equipWeapon(medievalFactory.createWeapon());
        warrior.equipArmor(medievalFactory.createArmor());
        warrior.displayEquipment();

        System.out.println("\n---\n");

        ArcherFactory archerFactory = new ArcherFactory();
        Character archer = archerFactory.createCharacter("Леголас");
        archer.display();
        archer.useSpecialAbility();

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();
        warrior.equipWeapon(medievalFactory.createWeapon());
        warrior.equipArmor(medievalFactory.createArmor());
        warrior.displayEquipment();

        System.out.println("\n=== Demo Complete (Factory Method) ===");


    }
}