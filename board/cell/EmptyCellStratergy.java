package board.cell;

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
public class EmptyCellStratergy implements CellStratergy{

    @Override
    public void execute(Player p) {
        //do nothing
        System.out.println(p + "Cell type: Empty");
    }
    
}
