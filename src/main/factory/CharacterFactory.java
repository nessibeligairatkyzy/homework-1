package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {


    public abstract Character createCharacter(String name);


    public Character create(String name) {
        Character character = createCharacter(name);
        System.out.println("Создан персонаж: " + character.getName() + " через фабрику");
        return character;
    }
}