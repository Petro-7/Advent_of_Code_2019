package Day2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Day2Test {

    @Test
    @DisplayName("Examples from instructions for first exercise")
    void calculations() {
        int[] numbers = {2, 2, 2, 30};

        assertAll("numbers",
                () -> assertEquals(numbers[0], Day2.Main.calculation(Arrays.asList(1, 0, 0, 0, 99))),
                () -> assertEquals(numbers[1], Day2.Main.calculation(Arrays.asList(2, 3, 0, 3, 99))),
                () -> assertEquals(numbers[2], Day2.Main.calculation(Arrays.asList(2, 4, 4, 5, 99, 0))),
                () -> assertEquals(numbers[3], Day2.Main.calculation(Arrays.asList(1, 1, 1, 4, 99, 5, 6, 0, 99)))
        );
    }
}
