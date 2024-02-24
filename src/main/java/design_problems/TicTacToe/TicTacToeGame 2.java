package design_problems.TicTacToe;

import design_problems.TicTacToe.models.Board;
import design_problems.TicTacToe.models.Player;

import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {

    Board board;
    Deque<Player> players;
    boolean isWinner = false;
    int turnCount = 0;
    int maxTurn;
    Player winner;

    TicTacToeGame(int size){
        maxTurn = size * size;
    }
    void initGame(){

    }
    boolean isValidInput(int row, int col){
        return true;
    }
    void checkWinner(Player player){
    }

    void startGame(){
        while(!isWinner || (turnCount < maxTurn)){
            Player player = players.getFirst();
            System.out.println("Player's Turn : " + player.getName() + "Playing with : " + player.getPlayingPiece());
            int row, col;
            do {
                System.out.println("Please choose any row and column - ");
                Scanner sc = new Scanner(System.in);
                row = sc.nextInt();
                col  = sc.nextInt();
            } while(!isValidInput(row, col));
            checkWinner(player);

            turnCount++;
        }
        if(isWinner){
            System.out.println("Winner is - " + winner);
        }
        else{
            System.out.println("The Game is Draw");
        }
    }

}
