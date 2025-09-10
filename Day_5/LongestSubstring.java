public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sub = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);

                // avoid using sub.contains(c) — use indexOf with String.valueOf(c)
                if (sub.indexOf(String.valueOf(c)) != -1) {
                    break;
                }

                sub.append(c);

                if (sub.length() > maxLength) {
                    maxLength = sub.length();
                }
            }
        }

        System.out.println("Length of Longest Substring: " + maxLength);
    }
}
