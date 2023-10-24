package one.week.prep.lonely.integer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

class Result {
    public static int lonelyInteger(List<Integer> arr) {
        int elementThatOccursOnce = 0;
        for (int i = 0; i < arr.size() ; i++) {
            int frequency = Collections.frequency(arr, arr.get(i));

            if(frequency == 1) {
                elementThatOccursOnce = arr.get(i);
                break;
            }
        }
        return elementThatOccursOnce;
    }
}
public class LonelyInteger {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        Result.lonelyInteger(arr);
    }
}
