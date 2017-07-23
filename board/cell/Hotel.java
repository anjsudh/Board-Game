/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package board.cell;

/**
 *
 * @author anjana-2492
 */
public class Hotel {
    public int rent;
    public int cost;
    public String name;

    public Hotel(String name, int rent, int cost) {
        this.name=name;
        this.rent = rent;
        this.cost = cost;
    }
    
    public String toString(){
        return this.name;
    }
    
}
