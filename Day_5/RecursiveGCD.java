public class RecursiveGCD {
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; 
        }
        return gcd(b, a % b); 
    }

    public static void main(String[] args) {
        int result = gcd(24, 36);
        System.out.println("GCD is: " + result);
    }
}
