package view;

import model.Car;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final String INPUT_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)";
    private static final String INPUT_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
    private static final String NAME_DELIMITER = ",";
    public InputView() {
    }

    public List<Car> askParticipant() {
        System.out.println(INPUT_CAR_NAME_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return parse(scanner);
    }

    private List<Car> parse(Scanner scanner) {
        try {
            String input = scanner.next();
            String[] tokens = input.split(NAME_DELIMITER);

            List<Car> result = new ArrayList<>();
            for(String name : tokens) {
                result.add(new Car(name));
            }

            return result;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askParticipant();
        }
    }

    public int askCount() {
        System.out.println(INPUT_COUNT_MESSAGE);
        Scanner sc = new Scanner(System.in);
        try {
            return sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            return askCount();
        }
    }
}
