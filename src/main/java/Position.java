import java.util.Objects;

public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        checkPosition(position);
        this.position = position;
    }

    private void checkPosition(int position) {
        if(position < 0) {
            throw new IllegalArgumentException("position 값은 0 ~ 9 사이만 가능합니다");
        }
    }

    public void move(int position) {
        if(position < 4) return;

        this.position += 1;
    }

    public boolean ratherThan(int maxPosition) {
        return this.position >= maxPosition;
    }

    public int getPosition() {
        return position;
    }

    public boolean isSame(int maxPosition) {
        return position == maxPosition;
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
