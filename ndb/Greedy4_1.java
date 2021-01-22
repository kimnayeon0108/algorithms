package ndb;

import java.util.Scanner;

public class Greedy4_1 {
    // 내 풀이
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 0;

        while(n > 1){
            if(n % k == 0){
                n = n / k;
            } else n--;
            count++;
        }
        System.out.println(count);
    }
}
