package com.superautopets.logic.structure.effects;

public abstract class UniversialFood extends UniversialEffect{

    private final int healthBoost;

    private final int attackBoost;

    private final String name;

    public UniversialFood(String name, String description, int healthBoost, int attackBoost) {
        super(description);
        this.healthBoost = healthBoost;
        this.attackBoost = attackBoost;
        this.name = name;
    }

    public int getHealthBoost() {
        return healthBoost;
    }

    public int getAttackBoost() {
        return attackBoost;
    }

    public String getName() {
        return name;
    }
}
