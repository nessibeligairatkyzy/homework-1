package com.narxoz.rpg.equipment;

public class IronSword implements Weapon {
    @Override
    public String getName() {
        return "Iron Sword";
    }

    @Override
    public int getDamage() {
        return 25;
    }

    @Override
    public String getDescription() {
        return "Классический железный меч (урон: 25)";
    }
}
