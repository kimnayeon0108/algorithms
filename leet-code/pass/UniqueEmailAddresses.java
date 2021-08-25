package pass;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {
        Set<String> answers = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {
            String[] names = emails[i].split("@");
            String name = names[0].replaceAll("\\.", "");
            int idx = name.indexOf("+");
            if (idx > -1) {
                name = name.substring(0, idx);
            }
            answers.add(name + "@" + names[1]);
        }

        return answers.size();
    }

    public static void main(String[] args) {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com", "test.email.leet+alex@code.com"}));
    }
}
