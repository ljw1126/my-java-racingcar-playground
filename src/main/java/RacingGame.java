import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RacingGame {
    private static final String DELIMITER = ",";

    private final Cars cars;
    private final StringBuilder sb = new StringBuilder();
    public RacingGame(String input) {
        this.cars = new Cars(initParticipant(input));
    }

    private static List<Car> initParticipant(String input) {
        String[] tokens = input.split(DELIMITER);

        List<Car> participant = new ArrayList<>();
        for(String name : tokens) {
            participant.add(new Car(name));
        }

        return participant;
    }

    public void play() {
        cars.move();
    }

    public void record() {
        sb.append(cars.getPlayRecord());
    }

    public String result() {
        String winners = cars.findWinners().stream().map(Car::getName).collect(Collectors.joining(", "));
        sb.append(winners).append("가 우승했습니다");
        return sb.toString();
    }
}
