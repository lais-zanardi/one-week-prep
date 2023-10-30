package one.week.prep.day.four;

class RecursiveDigitSumResult {
    public static int superDigit(String n, int k) {
        long superDigit = 0;
        for (int i = 0; i < n.length(); i++) {
            superDigit += Character.getNumericValue(n.charAt(i));
        }

        superDigit *= k;


        while (superDigit > 9) {
            long temp = 0;
            while (superDigit > 0) {
                temp += superDigit % 10;
                superDigit /= 10;
            }
            superDigit = temp;
        }

        return (int) superDigit;
    }

}
public class RecursiveDigitSum {
    public static void main(String[] args) {
        String s = "148";
        int k = 3;

        RecursiveDigitSumResult.superDigit(s, k);
    }
}
