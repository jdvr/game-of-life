package es.juandavidvega.gol;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.DeadCell;
import es.juandavidvega.gol.neighborhoods.UnhealthyNeighborhood;
import es.juandavidvega.gol.neighborhoods.HealthyNeighborhood;
import es.juandavidvega.gol.neighborhoods.WithoutEffectsNeighborhood;

public class AliveCellShould {

    @Test public void
    die_in_a_without_neighbours() {
        assertThat(
                new AliveCell().next(new UnhealthyNeighborhood())
        ).isEqualTo(new DeadCell());
    }

    @Test public void
    keep_live_with_two_neighbours(){
        assertThat(
                new AliveCell().next(new WithoutEffectsNeighborhood())
        ).isEqualTo(new AliveCell());
    }

    @Test public void
    keep_live_with_three_neighbours() {
        assertThat(
                new AliveCell().next(new HealthyNeighborhood())
        ).isEqualTo(new AliveCell());
    }

}
