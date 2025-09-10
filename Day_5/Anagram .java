 class EasyAnagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        
        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

       
        if (str1.length() != str2.length()) {
            System.out.println("Are they anagrams? false");
            return;
        }

        
        int[] count = new int[26]; // for a-z

        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        
        for (int c : count) {
            if (c != 0) {
                System.out.println("Are they anagrams? false");
                return;
            }
        }

        System.out.println("Are they anagrams? true");
    }
}
