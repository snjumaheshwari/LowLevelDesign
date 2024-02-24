package design_problems.TicTacToe.models;

public class Board {
    int size;
    PlayingPiece board[][];

    Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }
}
