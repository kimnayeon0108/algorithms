package ndb;

import java.util.Scanner;

public class Implementation4_1_1 {
    // 내 풀이 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int locationX = 1;
        int locationY = 1;
        s.nextLine();
        String moveInput = s.nextLine();
        String[] moveArr = moveInput.split(" ");
        for (int i = 0; i < moveArr.length; i++) {
            if (locationX == n && moveArr[i].equals("R")) continue;
            if (locationY == n && moveArr[i].equals("D")) continue;
            if (locationX == 1 && moveArr[i].equals("L")) continue;
            if (locationY == 1 && moveArr[i].equals("U")) continue;
            switch (moveArr[i]) {
                case "L":
                    locationX--;
                    break;
                case "R":
                    locationX++;
                    break;
                case "U":
                    locationY--;
                    break;
                case "D":
                    locationY++;
                    break;
            }
        }
        System.out.println(locationY + " " + locationX);
    }
}
