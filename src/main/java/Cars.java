import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void move() {
        for(Car car : carList) {
            car.move(generateRandomNumber());
        }
    }

    private int generateRandomNumber() {
        return new Random().nextInt(10);
    }

    public List<Car> getWinner() {
        int maxPosition = getMaxPosition();
        return carList.stream()
                .filter(car -> car.isSamePosition(maxPosition))
                .collect(Collectors.toList());
    }

    public int getMaxPosition() {
        return carList.stream().map(Car::getPosition).reduce(0, Integer::max);
    }

}
