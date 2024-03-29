import java.util.Objects;

public class Car {
    private Name name;
    private Position position;

    public Car(String name) {
       this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int position) {
        if(position > 4) {
            this.position = this.position.move();
        }
    }

    public boolean isWinner(Position maxPosition) {
        return position.equals(maxPosition);
    }

    public Position maxPosition(Position maxPosition) {
        if(this.position.lessThan(maxPosition)) {
            return maxPosition;
        }

        return this.position;
    }

    public int getPosition() {
        return this.position.getPosition();
    }

    public String getName() {
        return this.name.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

}
