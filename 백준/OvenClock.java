import java.util.Scanner;

public class OvenClock {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int necessaryTime = sc.nextInt();

        int hour = a;
        int minute = b + necessaryTime;
        if (minute >= 60) {
            hour = hour + (minute / 60);
            minute = minute % 60;
        }
        if (hour >= 24) {
            hour = hour % 24;
        }

        System.out.println(hour + " " + minute);
    }
}
