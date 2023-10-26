package one.week.prep.day.one;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class ResultFindTheMedian {
    public static int findMedian(List<Integer> arr) {
        List<Integer> sortedList = arr
                .stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList.get(arr.size() / 2));
        return sortedList.get(arr.size() / 2 + 1);
    }
}
public class FindTheMedian {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);

        ResultFindTheMedian.findMedian(list);
    }

    }

