package es.juandavidvega.gol.neighborhoods;

import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.Cell;
import es.juandavidvega.gol.cell.DeadCell;

public interface Neighborhood {
    Cell next(AliveCell cell);
    Cell next(DeadCell cell);
}
