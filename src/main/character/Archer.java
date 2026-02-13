package com.narxoz.rpg.character;
import com.narxoz.rpg.equipment.Armor;      // ← добавь эту строку
import com.narxoz.rpg.equipment.Weapon;

public class Archer implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    public Archer(String name) {
        this.name = name;
        this.health = 100;
        this.mana = 50;
        this.strength = 50;
        this.intelligence = 50;
    }

    @Override
    public String getName() { return name; }
    @Override
    public int getHealth() { return health; }
    @Override
    public int getMana() { return mana; }
    @Override
    public int getStrength() { return strength; }
    @Override
    public int getIntelligence() { return intelligence; }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " использует PRECISE SHOT!");
    }

    @Override
    public void display() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    @Override
    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " экипировал оружие: " + weapon.getName());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " экипировал броню: " + armor.getName());
    }

    @Override
    public void displayEquipment() {
        System.out.println("Экипировка:");
        if (equippedWeapon != null) {
            System.out.println("  Оружие: " + equippedWeapon.getDescription());
        }
        if (equippedArmor != null) {
            System.out.println("  Броня:  " + equippedArmor.getDescription());
        }
    }
}