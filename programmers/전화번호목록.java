public class 전화번호목록 {
    // 효율성 3,4는 통과 못함
    public static boolean solution(String[] phone_book) {
        if (phone_book.length == 1) return true;

        for (int i = 0; i < phone_book.length - 1; i++) {
            for (int k = i + 1; k < phone_book.length; k++) {
                if(phone_book[i].startsWith(phone_book[k]) || phone_book[k].startsWith(phone_book[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] phone = {"1234", "1235", "567"};
        String[] phone2 = {"12","123","1235","567","88"};
        System.out.println(solution(phone2));
    }
}
