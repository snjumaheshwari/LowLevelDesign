package design_principles.solid_principle.open_closed.board_game.good;

public class DiceRoll {
    int faces;

    DiceRoll (int faces){
        this.faces = faces;
    }

    public Integer roll(){
        return (int) ((Math.random()) % faces);
    }
}
