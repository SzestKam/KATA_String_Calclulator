package kata;

import java.util.Arrays;

public class StringCalculator {
    public int add(String input) {
        if ("".equals(input)) return 0;

        String[] elements = input.split(",");
        return Arrays.stream(elements)
                .mapToInt(Integer::parseInt)
                .sum();
    }
}
