package design_problems.TicTacToe.models;

public abstract class PlayingPiece {
    PieceType type;
    PlayingPiece(PieceType type){
        this.type = type;
    }
}
