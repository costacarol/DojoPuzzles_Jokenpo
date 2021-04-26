package com.costacarol.dojopuzzles.jokenpo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void shouldReturnADraw() {
        Player player1 = new Player("Carol", MoveOptions.PAPER);
        Player player2 = new Player("Luis", MoveOptions.PAPER);
        Game game = new Game();
        Assertions.assertEquals("Draw!", game.play(player1, player2));
    }

    @Test
    void shouldReturnAPlayerOneWinsWithRock() {
        Player player1 = new Player("Carol", MoveOptions.ROCK);
        Player player2 = new Player("Luis", MoveOptions.SCISSORS);
        Game game = new Game();
        Assertions.assertEquals(player1.getName() + " wins!", game.play(player1, player2));
    }

    @Test
    void shouldReturnAPlayerOneWinsWithPaper() {
        Player player1 = new Player("Carol", MoveOptions.PAPER);
        Player player2 = new Player("Luis", MoveOptions.ROCK);
        Game game = new Game();
        Assertions.assertEquals(player1.getName() + " wins!", game.play(player1, player2));
    }

    @Test
    void shouldReturnAPlayerOneWinsWithScissors() {
        Player player1 = new Player("Carol", MoveOptions.SCISSORS);
        Player player2 = new Player("Luis", MoveOptions.PAPER);
        Game game = new Game();
        Assertions.assertEquals(player1.getName() + " wins!", game.play(player1, player2));
    }
}