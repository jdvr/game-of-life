package es.juandavidvega.gol;

public class TwoNeighbours implements Neighborhood {
    @Override
    public Cell next(AliveCell cell) {
        return new AliveCell();
    }

    @Override
    public Cell next(DeadCell cell) {
        return new DeadCell();
    }
}
