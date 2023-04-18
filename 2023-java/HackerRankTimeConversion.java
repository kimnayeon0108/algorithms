import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


public class HackerRankTimeConversion {
    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
            Date date = dateFormat.parse(s);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");

            if (s.endsWith("PM")) {
                if (date.getTime() != 12) {
                    date.setHours(date.getHours() + 12);
                }
            } else {
                if (date.getTime() == 12) {
                    date.setTime(0);
                }
            }
            return simpleDateFormat.format(date);
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println(Result.timeConversion(sc.nextLine()));
    }
}
