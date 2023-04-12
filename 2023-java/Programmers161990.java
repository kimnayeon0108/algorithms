public class Programmers161990 {
    // {minY, minX, maxY, maxX}
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int minX = wallpaper[0].length();
        int minY = wallpaper.length;
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[0].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    minX = Math.min(minX, j);
                    minY = Math.min(minY, i);
                    maxX = Math.max(maxX, j);
                    maxY = Math.max(maxY, i);
                }
            }
        }
        answer[0] = minY;
        answer[1] = minX;
        answer[2] = maxY + 1;
        answer[3] = maxX + 1;

        return answer;
    }

    public static void main(String[] args) {
        String[] arr = {".#...", "..#..", "...#."};
        solution(arr);
    }
}
