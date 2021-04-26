package com.costacarol.dojopuzzles.jokenpo;

public class Jokenpo implements GamesWithTwoPlayers {


    @Override
    public String play(Player player1, Player player2) {
              if(player1.getMove().equals(player2.getMove())){
                return "Draw!";
            }
            else if((player1.getMove().equals(MoveJokenpoOptions.SCISSORS) && player2.getMove().equals(MoveJokenpoOptions.PAPER))
                    || (player1.getMove().equals(MoveJokenpoOptions.PAPER) && player2.getMove().equals(MoveJokenpoOptions.ROCK))
                    || (player1.getMove().equals(MoveJokenpoOptions.ROCK) && player2.getMove().equals(MoveJokenpoOptions.SCISSORS))) {
                return player1.getName() + " wins!";
            }
            else {
                return player2.getName() + " wins!";
            }
        }
    }

