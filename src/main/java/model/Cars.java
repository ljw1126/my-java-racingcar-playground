package model;

import utils.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 일급 컬렉션
public class Cars {
    private static final String NEW_LINE = System.lineSeparator();
    private static final String HYPHEN = "-";
    private List<Car> carList;

    public Cars(List<Car> participant) {
        this.carList = participant;
    }

    private List<Car> mapping(List<String> participant) {
        List<Car> result = new ArrayList<>();
        for(String name : participant) {
            result.add(new Car(name));
        }

        return result;
    }

    public List<Car> findWinner() {
        Position maxPosition = getMaxPosition();
        return this.carList.stream()
                .filter(car -> car.isSamePosition(maxPosition))
                .collect(Collectors.toList());
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position();
        for(Car car : carList) {
            maxPosition = car.maxPosition(maxPosition);
        }
        return maxPosition;
    }

    public void move() {
        for(Car car : carList) {
            car.move(RandomNumberGenerator.generateRandomNumber());
        }
    }

    public String record() {
        StringBuilder sb = new StringBuilder();
        for(Car car : carList) {
            sb.append(car.getName()).append(" : ").append(repeatHyphen(car.getPosition())).append(NEW_LINE);
        }
        sb.append(NEW_LINE);

        return sb.toString();
    }

    private String repeatHyphen(Position position) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < position.getPosition(); i++) {
            sb.append(HYPHEN);
        }
        return sb.toString();
    }
}
