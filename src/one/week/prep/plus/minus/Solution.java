package one.week.prep.plus.minus;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
       List<Integer> positives = arr
               .stream()
               .filter(p -> p.intValue()>0)
               .collect(toList());

       List<Integer> negatives = arr
               .stream()
               .filter(p -> p.intValue()<0)
               .collect(toList());

       List<Integer> zeros = arr
               .stream()
               .filter(p -> p.equals(0))
               .collect(toList());

         double greaterThanZero = (double) positives.size() / (double) arr.size();
         double smallerThanZero = (double) negatives.size() / (double) arr.size();
         double equalsZero = (double) zeros.size() / (double) arr.size();

        System.out.printf("%.6f\n", greaterThanZero);
        System.out.printf("%.6f\n", smallerThanZero);
        System.out.printf("%.6f\n", equalsZero);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();

    }
}
