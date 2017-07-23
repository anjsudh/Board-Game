package player;

import board.Dice;
import board.Board;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjana-2492
 */
public class Player {
    public int money;
    String name;
    Board board;
    int position;

    public Player( String name, Board board) {
        this.money = 1000;
        this.name = name;
        this.board = board;
        this.position = 0;
    }
    
    public void play(){
        int noOfPositionsToMove = Dice.getInstance().rollDice();
        position+=noOfPositionsToMove;
        board.getCell(position).handlePlayer(this);
        //System.out.println("Amount in the end"+money);
    }
    
    public String toString(){
        return "Player :"+name;
    }
}
