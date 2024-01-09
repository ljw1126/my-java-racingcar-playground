import java.util.Random;

public class Car {

    String rider;
    int score;
    String distance;

    public Car(String rider) {
        this.rider = rider;
        this.score = 1;
        this.distance = "-";
    }

    public void move(int randomNumber) {
        if(randomNumber >= 4) {
            this.score += 1;
            this.distance += "-";
        }
    }

    public String getRider() {
        return rider;
    }

    public int getScore() {
        return score;
    }

    public String getDistance() {
        return distance;
    }
}
