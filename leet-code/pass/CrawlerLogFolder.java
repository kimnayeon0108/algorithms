package pass;

public class CrawlerLogFolder {
    // starts in the main folder
    // 최소 수행 횟수, logs를 수행하고 다시 메인응로 돌아가기 위한
    public static int minOperations(String[] logs) {

        int pointer = 0;
        for (int i = 0; i < logs.length; i++) {
            if (!logs[i].startsWith(".")) {
                pointer++;
            } else if (logs[i].equals("../") && pointer > 0) {
                pointer--;
            }
        }
        return pointer < 0 ? 0 : pointer;
    }

    public static void main(String[] args) {
        String[] str = {"d1/", "d2/", "../", "d21/", "./"};
        System.out.println(minOperations(str));
    }
}
