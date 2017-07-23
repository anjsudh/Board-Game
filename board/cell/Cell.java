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
public class Cell {
    public enum CellType {
        EMPTY,JAIL,TREASURE,TWO_STAR_HOTEL,THREE_STAR_HOTEL
    }
    CellStratergy stratergy;
    
    public Cell(CellType type) throws Exception{
        Hotel twoStar = new Hotel("Park", 100, 500);
        Hotel threeStar = new Hotel("Lemon Tree", 50, 200);
        switch(type){
            case JAIL: stratergy = new JailCellStratergy();break;
            case EMPTY: stratergy = new EmptyCellStratergy();break;
            case TWO_STAR_HOTEL: stratergy = new HotelCellStratergy(twoStar);break;
            case THREE_STAR_HOTEL: stratergy = new HotelCellStratergy(threeStar);break;
            case TREASURE: stratergy = new TreasureCellStratergy();break;
            default:throw new Exception("Cell type is invalid");
        }
    }
    
    public void handlePlayer(Player p){
        stratergy.execute(p);
    }
    
}
