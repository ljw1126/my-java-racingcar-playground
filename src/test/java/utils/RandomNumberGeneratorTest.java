package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

    @Test
    void random() {
        for(int i = 1; i <= 999; i++) {
            int random = RandomNumberGenerator.generateRandomNumber();
            Assertions.assertThat(random).isBetween(0, 9); // 0 ~9
        }
    }
}