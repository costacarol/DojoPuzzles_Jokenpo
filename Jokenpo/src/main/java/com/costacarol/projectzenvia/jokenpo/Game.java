package com.costacarol.projectzenvia.jokenpo;

public class Game {

    public String play(Player player1, Player player2) {

        if(player1.getMove().equals(player2.getMove())){
            return "Draw!";
        }
        else if((player1.getMove().equals(MoveOptions.SCISSORS) && player2.getMove().equals(MoveOptions.PAPER))
                || (player1.getMove().equals(MoveOptions.PAPER) && player2.getMove().equals(MoveOptions.ROCK))
                || (player1.getMove().equals(MoveOptions.ROCK) && player2.getMove().equals(MoveOptions.SCISSORS))) {
            return player1.getName() + " wins!";
        }
        else {
            return player2.getName() + " wins!";
        }
    }
}
