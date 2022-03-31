package com.superautopets.logic.structure.pets;

import com.superautopets.logic.structure.effects.UniversialAbility;
import com.superautopets.logic.structure.effects.UniversialFood;

public class UniversalPet {

    private final String name;

    private final UniversialAbility effect;

    private final int stage;

    private UniversialFood holding;

    private int level;

    private int health;

    private int attack;

    public UniversalPet(String name, UniversialAbility ability, int health, int attack, int stage, int level) {
        this.name = name;
        this.effect = ability;
        this.health = health;
        this.attack = attack;
        this.stage = stage;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public UniversialAbility getEffect() {
        return effect;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack > 1) {
            this.attack = attack;
            return;
        }
        this.attack = 1;
    }

    public int getStage() {
        return stage;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        this.level++;
    }

    public UniversialFood getHolding() {
        return holding;
    }

    public void give(UniversialFood holding) {
        this.holding = holding;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
