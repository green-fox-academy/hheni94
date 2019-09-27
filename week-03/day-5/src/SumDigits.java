public class SumDigits {
  public static void main(String[] args) {
    //Given a non-negative integer n, return the sum of its digits recursively (without loops).
    //Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
    //Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

    int inputNumber = 2019;
    System.out.println(sumDigits(inputNumber));
  }

  public static int sumDigits(int number) {
    if (number == 0) {
      return number;
    } else {
      return number % 10 + sumDigits(number / 10);
    }
  }
}
