import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PositionTest {

    @Test
    void create() {
        // given
        // when
        Position position = new Position(3);

        // then
        assertThat(position).isEqualTo(new Position(3));
    }

    @Test
    void valid() {
        assertThatThrownBy(() -> {
            Position position = new Position(-1);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void move() {
        // given
        // when
        Position position = new Position();
        position.move();

        // then
        assertThat(position).isEqualTo(new Position(1));
    }
}