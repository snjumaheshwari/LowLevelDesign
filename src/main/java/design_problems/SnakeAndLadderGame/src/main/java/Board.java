package design_problems.SnakeAndLadderGame.src.main.java;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Board {

    private final int rows, cols;

    private final List<Snake> snakes;
    private final List<Ladder> ladders;

    Board(int rows, int cols, List<Snake> snakes, List<Ladder> ladders){
        this.rows = rows;
        this.cols = cols;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    void initializeRandomoard(){

    }

   //TODO : Rename it
    int getMaximum(){
        return rows * cols;
    }

    void printBoard(){


    }

}
