function fibonacci(n) {
  return n <= 1
    ? n
    : fibonacci(n - 1) + fibonacci(n - 2)
}

const x = 5
const y = fibonacci(x) //5
