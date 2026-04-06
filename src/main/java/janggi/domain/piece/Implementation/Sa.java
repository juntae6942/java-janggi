package janggi.domain.piece.Implementation;

import janggi.domain.board.Castle;
import janggi.domain.board.CastleZone;
import janggi.domain.piece.PieceType;
import janggi.domain.piece.template.AbstractNormalPiece;
import janggi.domain.point.Point;
import janggi.domain.status.Team;

public class Sa extends AbstractNormalPiece {

    public Sa(Team team) {
        super(team, PieceType.SA, new Castle(
                new CastleZone(Point.of(3, 9), Point.of(5, 7)),
                new CastleZone(Point.of(3, 2), Point.of(5, 0))
        ));
    }
}
