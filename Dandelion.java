package Organism.Plant.Plants;
import Board.Board;
import Organism.Plant.Plant;

import javax.swing.*;

public class Dandelion extends Plant {
    public Dandelion(ImageIcon img, int strength, int initiative, boolean move, Board board, int x, int y){
        super(img, strength, initiative, move, board, x, y);
    }
}
