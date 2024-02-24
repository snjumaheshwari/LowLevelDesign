package design_problems.TicTacToe.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Player {
    String name;
    PlayingPiece playingPiece;
    boolean isWinner;
}
