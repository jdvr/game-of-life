package es.juandavidvega.gol;

public interface Neighborhood {
    Cell next(AliveCell cell);
    Cell next(DeadCell cell);
}
