package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {
    @Override
    public String getName() {
        return "Plate Armor";
    }

    @Override
    public int getDefense() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Тяжёлая пластинчатая броня (защита: 30)";
    }
}