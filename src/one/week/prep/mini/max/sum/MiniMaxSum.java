package one.week.prep.mini.max.sum;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

class Result {
    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> sortedList = arr
                .stream()
                .sorted()
                .collect(Collectors.toList());

        var minSum = sortedList
                .subList(0, arr.size()-1)
                .stream()
                .mapToLong(Integer::intValue)
                .sum();

        var maxSum = sortedList
                .subList(1, arr.size())
                .stream()
                .mapToLong(Integer::intValue)
                .sum();

        System.out.printf("%d %d", minSum, maxSum);
    }
}
public class MiniMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(793810624);
        arr.add(895642170);
        arr.add(685903712);
        arr.add(623789054);
        arr.add(468592370);

        Result.miniMaxSum(arr);
    }
}
