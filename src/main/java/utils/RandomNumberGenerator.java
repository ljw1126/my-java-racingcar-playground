package utils;

import java.util.Random;

public class RandomNumberGenerator {
    public static int generateRandomNumber() {
        return new Random().nextInt(10); // 0 ~ 9
    }
}
