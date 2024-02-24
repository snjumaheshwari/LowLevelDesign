package design_principles.solid_principle.open_closed.board_game.bad;

public class DiceRoll {

    public Integer roll(){
        return (int) ((Math.random()) % 6);
    }
}
