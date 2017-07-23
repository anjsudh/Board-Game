package board;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anjana-2492
 */
public class Dice {

    Integer predictions[];
    private static int counter = 0;
    private static Dice dice = null;
    private Dice(){
        predictions = new Integer[]{4, 4, 4, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11, 10, 12, 2, 3, 5, 6, 7, 8, 5, 11, 10, 12};
    }
    
    public static Dice getInstance(){
        if(dice==null){
            dice = new Dice();
        }
        return dice;
    }
    
    public void reset(){
        counter = 0;
    }
    
    public boolean notFinishedRolling(){
        return counter < (predictions.length -1);
    }
    public int rollDice() {
        return predictions[counter++];
    }
}
