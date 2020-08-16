package LevelThree;

import LevelOne.LevelOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LevelThree {
    public String findFirstCorrect(String submissions) {
        LevelOne levelOne = new LevelOne();

        List<String> result = List.of(submissions.split(" "));
        List<String> res = new ArrayList<>();
        String startTime = result.get(0);
        int numbSubmissions = Integer.valueOf(result.get(1));

        for (int i = 2, j = 2, k = 2; i < numbSubmissions; i = i + 2) {

            String id = result.get(i);
            String time = result.get(i + 1);
            String output = result.get(i + 2);
            res.add(String.join(" ", id, time, output));
        }

        List<String> r = res.stream().filter(e -> e.endsWith("correct"))
                .map(e -> e.split(" "))
                .flatMap(e -> Arrays.stream(e))
                .collect(Collectors.toList());
        for (String e : r
        ) {

            System.out.println(e);
        }
        return "";
    }
}
