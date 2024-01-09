import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberUtilsTest {

    @Test
    void randomNumber() {
        for(int i = 0; i < 100; i++) {
            assertThat(NumberUtils.generatorRandomNumber()).isBetween(0, 9);
        }
    }
}