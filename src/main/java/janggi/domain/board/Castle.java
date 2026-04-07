package janggi.domain.board;

import janggi.domain.point.Point;

public enum Castle {

    HAN(new CastleZone(Point.of(3, 9), Point.of(5, 7))),
    CHO(new CastleZone(Point.of(3, 2), Point.of(5, 0))),
    ;

    private final CastleZone zone;

    Castle(CastleZone zone) {
        this.zone = zone;
    }

    public boolean contains(Point target) {
        return zone.contains(target);
    }

    public boolean inSameCastle(Point from, Point to) {
        return (HAN.contains(from) && HAN.contains(to)) ||
                (CHO.contains(from) && CHO.contains(to));
    }
}
