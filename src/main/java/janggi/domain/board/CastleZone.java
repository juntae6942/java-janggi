package janggi.domain.board;

import janggi.domain.point.Point;

public class CastleZone {

    private final Point topLeft;
    private final Point bottomRight;

    public CastleZone(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public boolean contains(Point target) {
        return target.getRow() >= bottomRight.getRow() && target.getRow() <= topLeft.getRow() &&
                target.getColumn() >= topLeft.getColumn() && target.getColumn() <= bottomRight.getColumn();
    }
}
