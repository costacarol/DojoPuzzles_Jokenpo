package com.costacarol.dojopuzzles.jokenpo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    public void shouldReturnIllegalArgumentExceptionWithNullValue(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->  new Player("null", MoveJokenpoOptions.PAPER));
    }

    @Test
    public void shouldReturnIllegalArgumentExceptionWithBlankValue(){
        Assertions.assertThrows(IllegalArgumentException.class, () ->  new Player("", MoveJokenpoOptions.PAPER));
    }
}