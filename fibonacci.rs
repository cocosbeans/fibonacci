fn fibonacci(n: i32) -> u64 {
  match n {
    0 => 0,
    1 => 1,
    _ => fibonacci(n - 1) + fibonacci(n - 2),
  }
}

fn main() {
  fibonacci(5); //5
}
