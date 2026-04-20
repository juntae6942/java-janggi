package janggi.domain.piece.direction;

import java.util.Arrays;
import java.util.List;

public interface Direction {
    Offset getTarget();
    List<Offset> getWaypoints();

    static <T extends Enum<T> & Direction> T find(Class<T> enumClass, int col, int row, String errorMessage) {
        return Arrays.stream(enumClass.getEnumConstants())
                .filter(dir -> dir.getTarget().directionColumn() == col &&
                        dir.getTarget().directionRow() == row
                ).findFirst()
                .orElseThrow(() -> new IllegalArgumentException(errorMessage));
    }
}
