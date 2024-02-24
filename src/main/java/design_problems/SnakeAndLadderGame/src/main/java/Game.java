package design_problems.SnakeAndLadderGame.src.main.java;

import design_problems.SnakeAndLadderGame.src.main.java.exceptions.NotFoundException;

import java.util.Deque;
import java.util.HashMap;


public class Game {
    Dicee dice;
    Deque<Player> players;
    Board board;
    HashMap<Player, Integer> playerPositions;
    Player winner;

    void play() throws NotFoundException {
        if(players.isEmpty()){
            throw new NotFoundException("Players not Found");
        }
        while(shouldContinueGame()){
            Player player = players.pollFirst();

            System.out.println("Roll The Dice :" + player.getName());

            int diceResult = dice.roll();
            System.out.println(player + " Got :" + diceResult);
            players.addLast(player);
            updatePlayerPosition(player, diceResult);
            checkWinner(player);

        }
    }

    private boolean shouldContinueGame() {
        return winner == null;
    }
    private void updatePlayerPosition(Player player, int diceResult){
        int finalPosition = playerPositions.get(player) + diceResult;
        if(finalPosition > board.getMaximum()){
            return;
        }


    }

    void checkWinner(Player player){
        if(playerPositions.get(player) == board.getMaximum()) {
            winner = player;
        }
    }
}
