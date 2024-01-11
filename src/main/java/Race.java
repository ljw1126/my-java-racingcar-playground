import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Race {
    private static final String DELIMITER = ",";
    private final List<Car> carList;
    private final StringBuilder sb = new StringBuilder();

    public Race(String input) {
        this.carList = participate(input);
        this.record();
    }

    private static List<Car> participate(String input) {
        List<Car> inputs = new ArrayList<>();
        String[] tokens = input.split(DELIMITER);
        for(String token : tokens) {
            if(token.length() > 5) {
                throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다");
            }

            inputs.add(new Car(token));
        }

        return inputs;
    }

    public void play() {
        for(Car car : carList) {
            car.move(NumberUtils.generatorRandomNumber());
        }
    }

    public void record() {
        for(Car car : carList) {
            sb.append(car.getRider()).append(" : ").append(car.getDistance()).append("\n");
        }
        sb.append("\n");
    }

    public String getResult() {
        int maxScore = carList.stream().map(Car::getScore).reduce(0, Integer::max);
        String winner = carList.stream().filter(car -> car.getScore() == maxScore).map(Car::getRider)
                .collect(Collectors.joining(", "));

        sb.append(winner).append("가 최종 우승 했습니다");
        return sb.toString();
    }

}
