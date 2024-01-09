import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("jason");
    }

    @Test
    void moveCar() {
        car.move(4);
        assertThat(car.getScore()).isEqualTo(2);
        assertThat(car.getDistance()).isEqualTo("--");
    }

    @Test
    void stopCar() {
        car.move(3);
        assertThat(car.getScore()).isEqualTo(1);
        assertThat(car.getDistance()).isEqualTo("-");
    }
}