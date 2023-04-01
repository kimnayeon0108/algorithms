import java.util.Scanner;
import java.util.Stack;

public class HackerRankSimpleTextEditor {

    static Stack<String> log = new Stack<>();

    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < count; i++) {
            s = executeOperation(sc.nextLine(), s);
        }
    }

    private static String executeOperation(String operation, String s) {
        int operationType = operation.charAt(0) - '0';
        StringBuilder sb = new StringBuilder(s);
        switch (operationType) {
            case 1:
                log.push(s);
                sb.append(operation.split(" ")[1]);
                return sb.toString();
            case 2:
                log.push(s);
                int deleteSize = Integer.parseInt(operation.split(" ")[1]);
                sb.delete(s.length() - deleteSize, s.length());
                return sb.toString();
            case 3:
                System.out.println(s.charAt(Integer.parseInt(operation.split(" ")[1]) - 1));
                return s;
            case 4:
               return log.pop();
        }
        return s;
    }
}
