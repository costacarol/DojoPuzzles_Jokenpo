package io.github.costacarol.jokenpo;

public class Player {

    private String name;
    private Enum move;

    public Player(String name, Enum move) {
        this.validateValueOfName(name);
        this.name = name;
        this.move = move;
    }

    public String getName() {
        return name;
    }

    public Enum getMove() {
        return move;
    }

    public boolean validateValueOfName(String name){
        if(name.equals("null") || name.isBlank()){
            throw new IllegalArgumentException("Insert a valid name.");
        }
        return true;
    }
}
