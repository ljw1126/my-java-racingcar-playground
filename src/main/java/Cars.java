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

    public List<Car> findWinners() {
        return findWinners(getMaxPosition());
    }

    // 클래스 메서드 - 테스트 하기는 좋음
    public static List<Car> findWinners(List<Car> carList, Position maxPosition) {
        return carList.stream()
                .filter(car -> car.isWinner(maxPosition))
                .collect(Collectors.toList());
    }

    // 인스턴스 메서드 - 생성자에 의존하여 테스트 코드가 늘지만 문맥상 맞음
    private List<Car> findWinners(Position maxPosition) {
        return carList.stream()
                .filter(car -> car.isWinner(maxPosition))
                .collect(Collectors.toList());
    }

    public Position getMaxPosition() {
        Position maxPosition = new Position();
        for(Car car : carList) {
            maxPosition = car.maxPosition(maxPosition);
        }
        return maxPosition;
    }

    public String getPlayRecord() {
        StringBuilder sb = new StringBuilder();
        for(Car car : carList) {
            sb.append(car.getName()).append(" : ").append(repeatHyphen(car.getPosition())).append("\n");
        }
        sb.append("\n");

        return sb.toString();
    }

    public String repeatHyphen(int count) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < count; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
