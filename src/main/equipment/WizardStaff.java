package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    @Override
    public String getName() {
        return "Wizard Staff";
    }

    @Override
    public int getDamage() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Магический посох (урон: 15, +25 маны)";
    }
}