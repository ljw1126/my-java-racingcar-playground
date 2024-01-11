import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @Test
    void maxPositionTest() {
        // given
        // when
        Cars cars = new Cars(Arrays.asList(
                new Car("aaaa", 2),
                new Car("bbbb", 1),
                new Car("cccc", 2)
        ));
        // then
        assertThat(cars.getMaxPosition()).isEqualTo(2);
    }

    @DisplayName("")
    @Test
    void winnerTest() {
        // given
        // when
        Cars cars = new Cars(Arrays.asList(
                new Car("aaaa", 2),
                new Car("bbbb", 1),
                new Car("cccc", 2)
        ));

        List<Car> winners = Arrays.asList(new Car("aaaa", 2), new Car("cccc", 2));

        // then
        assertThat(cars.getWinner()).isEqualTo(winners);
    }
}