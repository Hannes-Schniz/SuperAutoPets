package com.superautopets.logic.structure.pets.levelone;

import com.superautopets.logic.structure.effects.abilities.stageOne.AntEffect;
import com.superautopets.logic.structure.pets.UniversalPet;

public class Ant extends UniversalPet {

    private static final String NAME = "Ant";
    private static final AntEffect EFFECT = new AntEffect();
    private static final int MAXHEALTH = 1;
    private static final int MAXATTACK = 2;
    private static final int STAGE = 1;

    public Ant() {
        super(NAME, EFFECT, MAXHEALTH, MAXATTACK, STAGE, 0);
    }

}
