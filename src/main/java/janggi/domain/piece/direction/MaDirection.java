package janggi.domain.piece.direction;

import java.util.List;

public enum MaDirection implements Direction{
    UP_LEFT(
        new Offset(-1, -2),
        new Offset(0, -1)
    ),
    UP_RIGHT(
        new Offset(1, -2),
        new Offset(0, -1)
    ),
    DOWN_LEFT(
        new Offset(-1, 2),
        new Offset(0, 1)
    ),
    DOWN_RIGHT(
        new Offset(1, 2),
        new Offset(0, 1)
    ),
    LEFT_UP(
        new Offset(-2, -1),
        new Offset(-1, 0)
    ),
    LEFT_DOWN(
        new Offset(-2, 1),
        new Offset(-1, 0)
    ),
    RIGHT_UP(
        new Offset(2, -1),
        new Offset(1, 0)
    ),
    RIGHT_DOWN(
        new Offset(2, 1),
        new Offset(1, 0)
    ),
    ;

    private final Offset target;
    private final Offset routes;

    MaDirection(Offset target, Offset route) {
        this.target = target;
        this.routes = route;
    }

    @Override
    public Offset getTarget() {
        return this.target;
    }

    @Override
    public List<Offset> getWaypoints() {
        return List.of(routes);
    }
}
