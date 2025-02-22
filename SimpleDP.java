public class SimpleDP {
    //Dynamic Programming Optimized fibonacci method
    public static int fibonacciOptimized(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int a = 0, b = 1, c = 0;
        for(int i=2; i<=n; ++i) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }

    //Dynamic Programming Tabulation fibonacci method
    public static int fibonacciTabulation(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; ++i) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    //Dynamic Programming Memoization fibonacci method
    public static int fibonacciMemoization(int n, int[] memo) {
        if(n == 0 || n == 1) {
            return n;
        }

        if(memo[n] != 0) {
            return memo[n];
        }

        memo[n] = fibonacciMemoization(n-1, memo) + fibonacciMemoization(n-2, memo);
        return memo[n];
    }

    //Normal fibonacci method
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    //Method to call each fibonacci function
    public static void start() {
        int n = 5;
        double startTime = 0, endTime = 0, executionTime = 0;

        System.out.println("Normal Fibonacci Method: ");
        System.out.println("Time Complexity = O(2^n)");
        System.out.println("Space Complexity = O(n)");
        startTime = System.currentTimeMillis();
        System.out.println("Output: " + fibonacci(n));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution Time in Milliseconds = " + executionTime + " ms");
        System.out.println();

        System.out.println("Dynamic Programming Memoization Fibonacci Method: ");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        startTime = System.currentTimeMillis();
        System.out.println("Output: " + fibonacciMemoization(n, new int[n+1]));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution Time in Milliseconds = " + executionTime + " ms");
        System.out.println();

        System.out.println("Dynamic Programming Tabulation Fibonacci Method: ");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        startTime = System.currentTimeMillis();
        System.out.println("Output: " + fibonacciTabulation(n));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution Time in Milliseconds = " + executionTime + " ms");
        System.out.println();

        System.out.println("Dynamic Programming Optimized Fibonacci Method: ");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");
        startTime = System.currentTimeMillis();
        System.out.println("Output: " + fibonacciOptimized(n));
        endTime = System.currentTimeMillis();
        executionTime = endTime - startTime;
        System.out.println("Execution Time in Milliseconds = " + executionTime + " ms");
    }

    public static void main(String[] args) {
        //Fibonacci sequence -> 0 1 1 2 3...
        start();
    }
}
