package board;


import board.cell.Cell;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anjana-2492
 */
public class Board {
    ArrayList<Cell> cells;
    public Board() throws Exception{
       cells = new ArrayList<Cell>();
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.TWO_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.THREE_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.TWO_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.THREE_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.TWO_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.TWO_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.EMPTY));
       cells.add(new Cell(Cell.CellType.THREE_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.JAIL));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.TREASURE));
       cells.add(new Cell(Cell.CellType.TWO_STAR_HOTEL));
       cells.add(new Cell(Cell.CellType.TREASURE));
    }
    
    public Cell getCell(int position){
        return cells.get(position%cells.size());
    }
}
