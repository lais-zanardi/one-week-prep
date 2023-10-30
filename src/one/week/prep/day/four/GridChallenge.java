package one.week.prep.day.four;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

class GridChallengeResult {
    private static boolean isLexicographicallySorted(List<Character> list1, List<Character> list2) {
        for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
            if (list1.get(i) > list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static String gridChallenge(List<String> grid) {
        List<List<Character>> list = new ArrayList<>();
        for (String s : grid) {
            list.add(s.chars()
                    .mapToObj(e -> (char) e)
                    .sorted()
                    .collect(toList())
            );
        }

        for (int i = 0; i < list.size() - 1; i++) {
            if (!isLexicographicallySorted(list.get(i), list.get(i + 1))) {

                return "NO";
            }
        }
        return "YES";
    }
}
public class GridChallenge {
    public static void main(String[] args) {
        public static void main (String[]args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = Integer.parseInt(bufferedReader.readLine().trim());

            IntStream.range(0, t).forEach(tItr -> {
                try {
                    int n = Integer.parseInt(bufferedReader.readLine().trim());

                    List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                                try {
                                    return bufferedReader.readLine();
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                            })
                            .collect(toList());

                    String result = GridChallengeResult.gridChallenge(grid);

                    bufferedWriter.write(result);
                    bufferedWriter.newLine();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}