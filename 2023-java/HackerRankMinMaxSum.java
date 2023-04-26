
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class HackerRankMinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }

    static class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            arr.sort(Comparator.naturalOrder());
            long min =0;
            long max = 0;
            for (int i = 0; i < arr.size(); i++) {
                if (i != 0) {
                    max += arr.get(i);
                }

                if (i != arr.size() - 1) {
                    min += arr.get(i);
                }
            }
            System.out.println(min + " " + max);
        }

    }
}

