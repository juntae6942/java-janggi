package janggi.domain.piece.Implementation;

import janggi.domain.piece.PieceType;
import janggi.domain.piece.direction.Direction;
import janggi.domain.piece.direction.MaDirection;
import janggi.domain.piece.template.AbstractFixedStepPiece;
import janggi.domain.point.Point;
import janggi.domain.point.Points;
import janggi.domain.status.Team;
import java.util.List;

public class Ma extends AbstractFixedStepPiece {

    public Ma(Team team) {
        super(team, PieceType.MA);
    }

    @Override
    public Points getRoutePoints(Point from, Point to) {
        int pathX = to.calculatePathColumn(from);
        int pathY = to.calculatePathRow(from);

        Direction direction = Direction.find(MaDirection.class, pathX, pathY, "[ERROR] 마가 이동할 수 없는 방향입니다.");

        Point point = Point.of(from.getColumn() + direction.getWaypoints().getFirst().directionColumn(), from.getRow() + direction.getWaypoints().getFirst().directionRow());
        return new Points(List.of(point));
    }
}
