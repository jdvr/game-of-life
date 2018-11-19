package es.juandavidvega.gol;


import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.Cell;
import es.juandavidvega.gol.cell.DeadCell;

public class Main {

    public static void main(String[] args) {
        Cell[][] cells = new Cell[][] {
                {new AliveCell(), new DeadCell(), new AliveCell()},
                {new AliveCell(), new DeadCell(), new AliveCell()},
                {new AliveCell(), new DeadCell(), new AliveCell()}
        };

        var universe = new Universe(cells);
        for (var i = 0; i < 5; i++) {
            System.out.println(universe.toString());
            universe = universe.next();
        }

    }
}
