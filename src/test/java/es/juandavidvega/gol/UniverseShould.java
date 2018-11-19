package es.juandavidvega.gol;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.Cell;
import es.juandavidvega.gol.cell.DeadCell;

public class UniverseShould {

    @Test public void
    generate_the_next_generation_of_cells() {
        assertThat(new Universe(
                new Cell[][]{
                        {new AliveCell(), new DeadCell(), new AliveCell()},
                        {new AliveCell(), new DeadCell(), new AliveCell()},
                        {new AliveCell(), new DeadCell(), new AliveCell()}
                }).next()
        ).isEqualTo(
                new Universe(
                        new Cell[][]{
                                {new DeadCell(), new DeadCell(), new DeadCell()},
                                {new AliveCell(), new DeadCell(), new AliveCell()},
                                {new DeadCell(), new DeadCell(), new DeadCell()}
                        })
        );
    }
}
