package one.week.prep.diagonal.difference;

import java.util.List;

class Solution {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sumFirstDiagonal = 0;
        int sumSecondDiagonal = 0;
        int k = arr.size()-1;
        for (int i = 0; i < arr.size(); i++) {
                    sumFirstDiagonal += arr.get(i).get(i);
                    sumSecondDiagonal += arr.get(i).get(k);
                    k--;
                }
        int absoluteDifference = Math.abs(sumSecondDiagonal-sumFirstDiagonal);
        return absoluteDifference;
    }
}

public class DiagonalDifference {
    public static void main(String[] args) {

    }
}
