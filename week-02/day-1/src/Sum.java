public class Sum {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.
        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

        int inputNumber = 10;
        System.out.println(sum(inputNumber));
    }
    public static int sum(int number) {
        int sum = 0;
        for (int i = 0; i < number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
