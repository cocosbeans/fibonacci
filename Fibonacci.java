// Quick note, I'm learning Java and I just guessed that this would be the same as C#.
// It's crazy that I was right. This code was a guess and I got it right lol

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        fibonacci(5); //5
    }
}
