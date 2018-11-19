package es.juandavidvega.gol.cell;

import es.juandavidvega.gol.neighborhoods.Neighborhood;

public interface Cell {
    Cell next(Neighborhood neighborhood);
}
