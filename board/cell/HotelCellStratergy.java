package board.cell;


import player.Player;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjana-2492
 */
public class HotelCellStratergy implements CellStratergy{
    Player owner;
    Hotel hotel;

    public HotelCellStratergy(Hotel hotel) {
        this.hotel = hotel;
    }
    
    
    @Override
    public void execute(Player p) {
        System.out.println(p + "Cell type: Hotel : "+hotel);
        if(owner == null && p.money >= hotel.cost){
            owner = p;
            p.money -= hotel.cost;
        } else if(owner != null && owner != p){
            synchronized (this) {
                owner.money+=hotel.rent;
                p.money-=hotel.rent;
            }
        }
    }
}
