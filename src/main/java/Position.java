import java.util.Objects;

public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if(position < 0) {
            throw new IllegalArgumentException("position 값은 0 ~ 9 사이만 가능합니다");
        }
        this.position = position;
    }

    public Position move() {
        this.position += 1;
        return this;
    }

    public boolean lessThan(Position maxPosition) {
        return position < maxPosition.getPosition();
    }

    public int getPosition() {
        return position;
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

}
