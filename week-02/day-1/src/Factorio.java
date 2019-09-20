public class Factorio {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        int inputNumber = 5; //Factorio: 5! = 5*4*3*2*1
        System.out.println(factorio(inputNumber));
    }
    public static int factorio(int number) {
        int factNumber = number;
        for (int i = number-1; i > 0 ; i--) {
            factNumber = factNumber * i;
        }
        return factNumber;
    }
}
