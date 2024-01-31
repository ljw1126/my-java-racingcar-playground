package model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    @Test
    void move() {
        Car car = new Car("dobby");
        car.move(4);

        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }

    @Test
    void stop() {
        Car car = new Car("dobby");
        car.move(3);

        assertThat(car.getPosition()).isEqualTo(new Position(0));
    }
}