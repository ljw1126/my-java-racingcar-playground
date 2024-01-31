package model;

import java.util.Objects;

public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if(position < 0) {
            throw new IllegalArgumentException("위치값은 0 이상만 가능합니다.");
        }
        this.position = position;
    }

    public Position move() {
        return new Position(this.position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public boolean greatThan(Position maxPosition) {
        return this.position > maxPosition.getPosition();
    }

    public int getPosition() {
        return this.position;
    }

    public boolean isSame(int maxPosition) {
        return this.position == maxPosition;
    }
}
