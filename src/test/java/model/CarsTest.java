package model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @ParameterizedTest
    @MethodSource("findWinnersTestDataProvider")
    void findWinners(List<Car> participant, List<Car> expectedWinners) {
        Cars cars = new Cars(participant);
        List<Car> winner = cars.findWinner();

        assertThat(winner).isEqualTo(expectedWinners);
    }

    private static Stream<Arguments> findWinnersTestDataProvider() {
        return Stream.of(
                Arguments.arguments(Arrays.asList(new Car("dobby", 1), new Car("harry", 2), new Car("ron", 3)), Arrays.asList(new Car("ron", 3))),
                Arguments.arguments(Arrays.asList(new Car("dobby", 1), new Car("harry", 3), new Car("ron", 2)), Arrays.asList(new Car("harry", 3))),
                Arguments.arguments(Arrays.asList(new Car("dobby", 3), new Car("harry", 3), new Car("ron", 1)), Arrays.asList(new Car("dobby", 3), new Car("harry", 3)))
        );
    }
}