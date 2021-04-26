package com.costacarol.projectzenvia.jokenpo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    public void shouldReturnIllegalArgumentException(){
       Assertions.assertThrows(IllegalArgumentException.class, () ->  new Player(null, MoveOptions.PAPER));
    }
}