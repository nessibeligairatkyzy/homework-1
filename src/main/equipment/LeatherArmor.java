package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    @Override
    public String getName() {
        return "Leather Armor";
    }

    @Override
    public int getDefense() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Кожаная броня (защита: 20, +ловкость)";
    }
}