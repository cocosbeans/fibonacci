namespace Fibonacci;

class Program {
  static int Fibonacci(int n) {
    if (n <= 1) return n;
    else return Fibonacci(n - 1) + Fibonacci(n - 2);
  }
  
  static void Main() {
    Fibonacci(5); //5
  }
}
