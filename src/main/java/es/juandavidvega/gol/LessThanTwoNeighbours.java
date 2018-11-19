package es.juandavidvega.gol;

public class LessThanTwoNeighbours implements Neighborhood {

    @Override
    public Cell next(AliveCell cell) {
        return new DeadCell();
    }

    @Override
    public Cell next(DeadCell cell) {
        return new DeadCell();
    }
}
