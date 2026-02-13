package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    @Override
    public String getName() {
        return "Longbow";
    }

    @Override
    public int getDamage() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Длинный лук (урон: 30, дальний бой)";
    }
}