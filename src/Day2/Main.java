package Day2;

import Day1.FileReader;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("src" + File.separator + "day2"
                + File.separator + "input1.txt");

        String input = FileReader.readFile(filePath);
        List<String> inputData = Arrays.asList(input.split("[^0-9]"));
        List<Integer> instructions = inputData.stream().map(Integer::parseInt).collect(Collectors.toList());
        int result1 = calculation(instructions);
        System.out.println("result1 = " + result1);

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                instructions = inputData.stream().map(Integer::parseInt).collect(Collectors.toList());
                instructions.set(1, i);
                instructions.set(2, j);
                if (calculation(instructions) == 19690720) {
                    System.out.println("i = " + i + " j = " + j);
                }
            }
        }
    }


    static int calculation(List<Integer> list) {
        int lineTypeIndex = 0;
        int lineType = list.get(lineTypeIndex);

        while (lineType != 99) {
            if (lineType == 1) {
                list.set(list.get(lineTypeIndex + 3), list.get(list.get(lineTypeIndex + 1)) + list.get(list.get(lineTypeIndex + 2)));
            } else if (lineType == 2)
                list.set(list.get(lineTypeIndex + 3), list.get(list.get(lineTypeIndex + 1)) * list.get(list.get(lineTypeIndex + 2)));
            lineTypeIndex += 4;
            lineType = list.get(lineTypeIndex);
        }
        return list.get(0);
    }
}
