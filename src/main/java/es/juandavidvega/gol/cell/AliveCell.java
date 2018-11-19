package es.juandavidvega.gol.cell;

import es.juandavidvega.gol.neighborhoods.Neighborhood;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class AliveCell implements Cell{

    public Cell next(Neighborhood neighborhood) {
        return neighborhood.next(this);
    }

    @Override
    public String toString() {
        return "*";
    }
}
