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

    public void move() {
        this.position += 1;
    }
}
