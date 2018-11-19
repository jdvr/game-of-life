package es.juandavidvega.gol;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class AliveCellShould {

    @Test public void
    die_in_a_without_neighbours() {
        assertThat(
                new AliveCell().next(new LessThanTwoNeighbours())
        ).isEqualTo(new DeadCell());
    }

    @Test public void
    keep_live_with_two_neighbours(){
        assertThat(
                new AliveCell().next(new TwoNeighbours())
        ).isEqualTo(new AliveCell());
    }

    @Test public void
    keep_live_with_three_neighbours() {
        assertThat(
                new AliveCell().next(new ThreeNeighbours())
        ).isEqualTo(new AliveCell());
    }

}
