package io.github.costacarol.jokenpo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void shouldReturnADraw() {
        Player player1 = new Player("Carol", MoveJokenpoOptions.PAPER);
        Player player2 = new Player("Luis", MoveJokenpoOptions.PAPER);
        GamesWithTwoPlayers game = new Jokenpo();
        Assertions.assertEquals("Draw!", game.play(player1, player2));
    }

    @Test
    void shouldReturnAPlayerOneWinsWithRock() {
        Player player1 = new Player("Carol", MoveJokenpoOptions.ROCK);
        Player player2 = new Player("Luis", MoveJokenpoOptions.SCISSORS);
        GamesWithTwoPlayers game = new Jokenpo();
        Assertions.assertEquals(player1.getName() + " wins!", game.play(player1, player2));
    }

    @Test
    void shouldReturnAPlayerOneWinsWithPaper() {
        Player player1 = new Player("Carol", MoveJokenpoOptions.PAPER);
        Player player2 = new Player("Luis", MoveJokenpoOptions.ROCK);
        GamesWithTwoPlayers game = new Jokenpo();
        Assertions.assertEquals(player1.getName() + " wins!", game.play(player1, player2));
    }

    @Test
    void shouldReturnAPlayerOneWinsWithScissors() {
        Player player1 = new Player("Carol", MoveJokenpoOptions.SCISSORS);
        Player player2 = new Player("Luis", MoveJokenpoOptions.PAPER);
        GamesWithTwoPlayers game = new Jokenpo();
        Assertions.assertEquals(player1.getName() + " wins!", game.play(player1, player2));
    }
}