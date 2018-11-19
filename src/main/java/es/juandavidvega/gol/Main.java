package es.juandavidvega.gol;


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
