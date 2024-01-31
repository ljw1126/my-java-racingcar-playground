package contorller;

import model.Car;
import model.RacingCar;
import view.InputView;
import view.OutputView;

import java.util.List;

public class RacingController {
    public void run() {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        // 사용자 입력
        List<Car> participant = inputView.askParticipant();
        RacingCar racingCar = new RacingCar(participant);

        outputView.recordParticipant(racingCar.getRacingInfo());

        int count = inputView.askCount();

        for(int i = 0; i < count; i++) {
            racingCar.move();
            outputView.recordRacingInfo(racingCar.getRacingInfo());
        }

        outputView.recordWinner(racingCar.getWinnerNames());
        outputView.showResult();
    }
}
