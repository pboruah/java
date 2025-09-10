public class PalindromeCheck {

    public static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) { 
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) { 
            return false;
        }
        
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        String text = "Able was I ere I saw Elba";
        String cleanedText = cleanString(text);

        System.out.println(isPalindrome(cleanedText)); 
    }
}
