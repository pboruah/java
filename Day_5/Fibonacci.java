public class Fibonacci {
    static int[] memo = new int[100]; 

    public static int fib(int n) {
        if (n <= 1) return n;   

        if (memo[n] != 0) return memo[n]; 

        memo[n] = fib(n - 1) + fib(n - 2); 
        return memo[n];
    }

    public static void main(String[] args) {
        int result = fib(10);
        System.out.println("Fibonacci(10) = " + result);
    }
}
