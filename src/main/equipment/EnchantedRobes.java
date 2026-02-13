package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    @Override
    public String getName() {
        return "Enchanted Robes";
    }

    @Override
    public int getDefense() {
        return 10;
    }

    @Override
    public String getDescription() {
        return "Зачарованные мантии (защита: 10, +25 маны)";
    }
}