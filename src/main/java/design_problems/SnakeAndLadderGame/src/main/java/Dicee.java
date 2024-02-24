package design_problems.SnakeAndLadderGame.src.main.java;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Dicee {
    int faces;

    void Dicee(int faces){
        this.faces = faces;
    }

    int roll(){
        return (int) ((Math.random())%faces);
    }
}
