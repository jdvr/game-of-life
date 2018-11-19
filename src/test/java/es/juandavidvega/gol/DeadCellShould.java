package es.juandavidvega.gol;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DeadCellShould {

    @Test public void
    keep_dead_without_neighbours() {
        assertThat(
                new DeadCell().next(new LessThanTwoNeighbours())
        ).isEqualTo(new DeadCell());
    }

    @Test public void
    keep_dead_with_two_neighbours() {
        assertThat(
                new DeadCell().next(new TwoNeighbours())
        ).isEqualTo(new DeadCell());
    }

    @Test public void
    come_to_live_with_three_neighbours() {
        assertThat(
                new DeadCell().next(new ThreeNeighbours())
        ).isEqualTo(new AliveCell());
    }


}
