import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RaceTest {

    @DisplayName("")
    @Test
    void nameLengthException() {
        // given
        // when
        String givenName = "leejinwoo";

        // then
        Assertions.assertThatThrownBy(() -> {
            Race race = new Race(givenName);
        }).isInstanceOf(IllegalArgumentException.class)
        .hasMessage("자동차 이름은 5자를 초과할 수 없습니다");
    }
}