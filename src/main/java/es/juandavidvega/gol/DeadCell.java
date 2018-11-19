package es.juandavidvega.gol;

import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class DeadCell implements Cell {

    public Cell next(Neighborhood neighborhood) {
        return neighborhood.next(this);
    }

    @Override
    public String toString() {
        return "_";
    }
}
