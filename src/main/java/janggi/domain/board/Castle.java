package janggi.domain.board;

import janggi.domain.point.Point;

public class Castle {

    private final CastleZone hanCastle;
    private final CastleZone choCastle;

    public Castle(CastleZone hanCastle, CastleZone choCastle ) {
        this.hanCastle = hanCastle;
        this.choCastle = choCastle;
    }

    public boolean inSameCastle(Point from, Point to) {
        return (hanCastle.contains(from) && hanCastle.contains(to)) ||
                (choCastle.contains(from) && choCastle.contains(to));
    }
}
