package janggi.domain.piece.direction;

import java.util.List;

public enum SangDirection implements Direction {
    UP_LEFT(
        new Offset(-2, -3),
        List.of(
            new Offset(0, -1),
            new Offset(-1, -2)
        )
    ),
    UP_RIGHT(
        new Offset(2, -3),
        List.of(
            new Offset(0, -1),
            new Offset(1, -2)
        )
    ),
    DOWN_LEFT(
        new Offset(-2, 3),
        List.of(
            new Offset(0, 1),
            new Offset(-1, 2)
        )
    ),
    DOWN_RIGHT(
        new Offset(2, 3),
        List.of(
            new Offset(0, 1),
            new Offset(1, 2)
        )
    ),
    LEFT_UP(
        new Offset(-3, -2),
        List.of(
            new Offset(-1, 0),
            new Offset(-2, -1)
        )
    ),
    LEFT_DOWN(
        new Offset(-3, 2),
        List.of(
            new Offset(-1, 0),
            new Offset(-2, 1)
        )
    ),
    RIGHT_UP(
        new Offset(3, -2),
        List.of(
            new Offset(1, 0),
            new Offset(2, -1)
        )
    ),
    RIGHT_DOWN(
        new Offset(3, 2),
        List.of(
            new Offset(1, 0),
            new Offset(2, 1)
        )
    ),
    ;

    private final Offset target;
    private final List<Offset> routes;

    SangDirection(Offset target, List<Offset> routes) {
        this.target = target;
        this.routes = routes;
    }

    @Override
    public Offset getTarget() {
        return this.target;
    }

    @Override
    public List<Offset> getWaypoints() {
        return routes;
    }
}
