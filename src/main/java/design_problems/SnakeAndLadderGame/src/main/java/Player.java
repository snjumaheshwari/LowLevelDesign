package design_problems.SnakeAndLadderGame.src.main.java;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    int id;
    private String name;
    Player(String name){
        this.name = name;
    }

}
