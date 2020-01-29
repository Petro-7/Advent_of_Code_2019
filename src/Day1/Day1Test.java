package Day1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day1Test {

    @Test
    @DisplayName("Examples from instructions for first exercise")
    void calculations() {
        int[] numbers = {2, 2, 654, 33583};
        assertAll("numbers",
                () -> assertEquals(numbers[0], Main.calculations(12)),
                () -> assertEquals(numbers[1], Main.calculations(14)),
                () -> assertEquals(numbers[2], Main.calculations(1969)),
                () -> assertEquals(numbers[3], Main.calculations(100756))
        );
    }
}
