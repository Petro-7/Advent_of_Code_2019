package Day1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src" + File.separator + "day1"
                + File.separator + "input1.txt");

        String inputData = FileReader.readFile(filePath);
        List<String> uncalculatedData = Arrays.asList(inputData.split(System.lineSeparator()));
        List<Integer> calculatedData = uncalculatedData.stream().map(x -> calculations(Integer.parseInt(x))).collect(Collectors.toList());
        Integer result1 = calculatedData.stream().reduce(0, Integer::sum);
        System.out.println("result1 = " + result1);

        List<Integer> recalculatedData = calculatedData.stream().map(Main::calculationsRecursion).collect(Collectors.toList());
        Integer result2 = recalculatedData.stream().reduce(0, Integer::sum);
        System.out.println("result2 = " + result2);
    }

    static int calculations(int data) {
        return data / 3 - 2;
    }

    static int calculationsRecursion(int data) {
        if (data < 0) {
            return 0;
        } else {
            return data + calculationsRecursion(data / 3 - 2);
        }
    }
}

