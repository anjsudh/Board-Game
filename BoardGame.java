
import board.Dice;
import board.Board;
import java.util.ArrayList;
import player.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anjana-2492
 */
public class BoardGame {

    public static void play() throws Exception {
        Board board = new Board();
        Dice dice = Dice.getInstance();
        dice.reset();

        ArrayList<Player> players = new ArrayList<Player>();
        players.add(new Player("Anjana", board));
        players.add(new Player("Harsha", board));
        players.add(new Player("Varsha", board));

        while (dice.notFinishedRolling()) {
            for (Player player : players) {
                if (dice.notFinishedRolling()) {
                    player.play();
                } else {
                    break;
                }
            }
        }

        for (Player player : players) {
            System.out.println(player + " has total worth " + player.money);
        }
    }

    public static void main(String args[]) throws Exception {
        play();
    }

}
