package es.juandavidvega.gol;

import java.util.Map;
import java.util.stream.Stream;

import es.juandavidvega.gol.cell.AliveCell;
import es.juandavidvega.gol.cell.Cell;
import es.juandavidvega.gol.neighborhoods.UnhealthyNeighborhood;
import es.juandavidvega.gol.neighborhoods.Neighborhood;
import es.juandavidvega.gol.neighborhoods.HealthyNeighborhood;
import es.juandavidvega.gol.neighborhoods.WithoutEffectsNeighborhood;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public class Universe {

    private static final Map<Integer, Neighborhood> neighborhoods = Map.of(
            2, new WithoutEffectsNeighborhood(),
            3, new HealthyNeighborhood()
    );

    private final Cell[][] grid;

    public Universe(Cell[][] grid) {
        this.grid = grid;
    }

    public Universe next() {
        var newGrid = new Cell[grid.length][];
        for (var i = 0; i < grid.length; i++) {
            newGrid[i] = new Cell[grid[i].length];
            for (var j = 0; j < grid[i].length; j++) {
               newGrid[i][j] = grid[i][j].next(neighborhood(i, j));
            }
        }
        return new Universe(newGrid);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (var i = 0; i < grid.length; i++) {
            for (var j = 0; j < grid[i].length; j++) {
                builder.append(grid[i][j].toString());
            }
            builder.append('\n');
        }
        return builder.toString();
    }

    private Neighborhood neighborhood(int x, int y) {
        var numberOfNeighbours =  Math.toIntExact(Stream.of(
                is_cell_alive_at(x + 1, y),
                is_cell_alive_at(x + 1, y + 1),
                is_cell_alive_at(x + 1, y - 1),
                is_cell_alive_at(x - 1, y),
                is_cell_alive_at(x - 1, y + 1),
                is_cell_alive_at(x - 1, y - 1),
                is_cell_alive_at(x, y - 1),
                is_cell_alive_at(x, y + 1)
        ).filter(c -> c).count());
        return neighborhoods.getOrDefault(numberOfNeighbours, new UnhealthyNeighborhood());
    }

    private Boolean is_cell_alive_at(int x, int y) {
        try {
            return grid[x][y].equals(new AliveCell());
        } catch (Exception e) {
            return false;
        }
    }

}
