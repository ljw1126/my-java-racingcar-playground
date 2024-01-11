import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String input = sc.next();

        System.out.println("시도할 회수는 몇회인가요?");
        int turn = sc.nextInt();

        RacingGame racingGame = new RacingGame(input);
        while(turn > 0) {
            racingGame.play();
            racingGame.record();
            turn -= 1;
        }

        System.out.println("실행 결과");
        System.out.println(racingGame.result());
    }
}
