package model;

import utils.RandomNumberGenerator;

import java.util.Objects;

public class Car {

    private static final int FORWARD_NUMBER = 4;
    private Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int random) {
        if(random >= FORWARD_NUMBER) {
            this.position = this.position.move();
        }
    }

    public Name getName() {
        return name;
    }

    public Position getPosition() {
        return position;
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
