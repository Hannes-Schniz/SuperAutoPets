package com.superautopets.logic.structure.board;

import com.superautopets.logic.structure.effects.UniversialFood;
import com.superautopets.logic.structure.pets.UniversalPet;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private UniversalPet[] playerPets;

    private UniversalPet[] opponentsPets;

    private List<UniversalPet> shopePets;

    private List<UniversialFood> shopFoods;

    public Board() {
        playerPets = new UniversalPet[5];
        opponentsPets = new UniversalPet[5];
        shopePets = new ArrayList<>();
        shopFoods = new ArrayList<>();
    }

    public UniversalPet[] getPlayerPets() {
        return playerPets;
    }

    public UniversalPet[] getOpponentsPets() {
        return opponentsPets;
    }

    public List<UniversalPet> getShopePets() {
        return shopePets;
    }

    public List<UniversialFood> getShopFoods() {
        return shopFoods;
    }

    public void setOpponentsPets(UniversalPet[] opponentsPets) {
        this.opponentsPets = opponentsPets;
    }

    public void setPlayerPets(UniversalPet[] playerPets) {
        this.playerPets = playerPets;
    }
}
