package es.juandavidvega.gol.neighborhoods;

import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.Cell;
import es.juandavidvega.gol.cell.DeadCell;

public class HealthyNeighborhood implements Neighborhood {
    @Override
    public Cell next(AliveCell cell) {
        return new AliveCell();
    }

    @Override
    public Cell next(DeadCell cell) {
        return new AliveCell();
    }
}
