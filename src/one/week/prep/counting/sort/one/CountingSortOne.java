package one.week.prep.counting.sort.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSortOne {
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> answer = new ArrayList<>(100);
        int frequency = 0;
        for (int i = 0; i < 100; i++) {
            frequency = Collections.frequency(arr, i);
            answer.add(frequency);
        }
        return answer;
    }
}
