package ru.job4j;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class LoopSumTest {

    @Test
    @DisplayName("when start is more that finish then result is 0")
    public void whenStart3Finish1Then0() {
        int output = LoopSum.sum(3, 1);
        assertThat(output).isEqualTo(0);
    }
}