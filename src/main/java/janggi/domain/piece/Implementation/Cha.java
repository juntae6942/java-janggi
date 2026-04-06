package janggi.domain.piece.Implementation;

import janggi.domain.board.Castle;
import janggi.domain.board.CastleZone;
import janggi.domain.piece.PieceType;
import janggi.domain.piece.template.AbstractStraightPiece;
import janggi.domain.point.Point;
import janggi.domain.point.Route;
import janggi.domain.status.Team;

public class Cha extends AbstractStraightPiece {

    public Cha(Team team) {
        super(team, PieceType.CHA, new Castle(
                        new CastleZone(Point.of(3, 9), Point.of(5, 7)),
                        new CastleZone(Point.of(3, 2), Point.of(5, 0))
        ));
    }

    public boolean canMove(Route route) {
        return route.isEmpty();
    }
}
