package view;

public class OutputView {
    private static final String FIRST_COMMENT = "실행 결과";
    private static final String WINNER_COMMENT = "가 최종 우승했습니다.";
    private static final String NEW_LINE = System.lineSeparator();
    private StringBuilder sb = new StringBuilder();
    public OutputView() {
    }

    public void recordParticipant(String racingInfo) {
        sb.append(FIRST_COMMENT).append(NEW_LINE);
        sb.append(racingInfo);
    }

    public void recordRacingInfo(String info) {
        sb.append(info);
    }

    public void recordWinner(String winnerNames) {
        sb.append(winnerNames).append(WINNER_COMMENT);
    }


    public void showResult() {
        System.out.println(sb.toString());
    }
}
