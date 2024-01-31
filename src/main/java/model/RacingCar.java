package model;

import java.util.List;
import java.util.stream.Collectors;

public class RacingCar {
    private final Cars cars; // 일급 컬렉션

    public RacingCar(List<Car> participant) {
        this.cars = new Cars(participant);
    }

    public String getWinnerNames() {
        List<Car> winner = this.cars.findWinner();
        return winner.stream()
                .map(Car::getName)
                .map(Name::toString)
                .collect(Collectors.joining(", "));
    }

    public void move() {
       this.cars.move();
    }

    public String getRacingInfo() {
        return cars.record();
    }
}
