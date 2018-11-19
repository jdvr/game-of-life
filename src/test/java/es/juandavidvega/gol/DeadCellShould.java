package es.juandavidvega.gol;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.DeadCell;
import es.juandavidvega.gol.neighborhoods.UnhealthyNeighborhood;
import es.juandavidvega.gol.neighborhoods.HealthyNeighborhood;
import es.juandavidvega.gol.neighborhoods.WithoutEffectsNeighborhood;

public class DeadCellShould {

    @Test public void
    keep_dead_without_neighbours() {
        assertThat(
                new DeadCell().next(new UnhealthyNeighborhood())
        ).isEqualTo(new DeadCell());
    }

    @Test public void
    keep_dead_with_two_neighbours() {
        assertThat(
                new DeadCell().next(new WithoutEffectsNeighborhood())
        ).isEqualTo(new DeadCell());
    }

    @Test public void
    come_to_live_with_three_neighbours() {
        assertThat(
                new DeadCell().next(new HealthyNeighborhood())
        ).isEqualTo(new AliveCell());
    }


}
