package org.example;

public class Player {
    private boolean isXTurn = true; // Assuming 'x' starts the game

    public void Next_Turn() {
        isXTurn = !isXTurn; // Toggle the turn
    }

    public String PlayersTurn() {
        return isXTurn ? " x " : " o ";
    }
}
