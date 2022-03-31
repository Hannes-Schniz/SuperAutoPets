package com.superautopets.logic.structure.effects;

import com.superautopets.logic.structure.board.Board;

public abstract class UniversialEffect {

    private final String description;

    public UniversialEffect(String description) {
        this.description = description;
    }

    public abstract void use(Board input);

    public String getDescription() {
        return description;
    }
}
