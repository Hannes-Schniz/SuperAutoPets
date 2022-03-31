package com.superautopets.logic.structure.effects.abilities.stageOne;

import com.superautopets.logic.structure.board.Board;
import com.superautopets.logic.structure.effects.UniversialAbility;
import com.superautopets.logic.structure.pets.UniversalPet;

import java.util.Random;

public class AntEffect extends UniversialAbility {

    private static final Random RAND = new Random();

    private static final String DESCRIPTION = "Ant gives two random other pets +2 attack and +1 health";

    public AntEffect() {
        super(DESCRIPTION);
    }

    @Override
    public void use(Board input) {
        UniversalPet[] playerPets = input.getPlayerPets();
        int random = RAND.nextInt(playerPets.length);
        playerPets[random].setAttack(playerPets[random].getAttack() + 2);
        playerPets[random].setHealth(playerPets[random].getHealth() + 1);
        input.setPlayerPets(playerPets);
    }
}
