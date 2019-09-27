public class FactorialPractice {
  public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    int inputNumber = 4;
    System.out.println(factorioWithRecursion(inputNumber));
  }

  /*public static int factorio(int number) {
  int factorial = number;
  for (int i = number - 1; i > 0 ; i--) {
    factorial *= i;
  }
  return factorial;
}*/

  /*public static int factorio(int number) {
    int factorial = 1;
    for (int i = 1; i < number + 1; i++) {
      factorial *= 1;
    }
    return factorial;
  }*/

  public static int factorioWithRecursion(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factorioWithRecursion(n - 1);
    }
  }
}