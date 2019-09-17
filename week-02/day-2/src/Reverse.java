public class Reverse {
    public static void main(String... args) {

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.
        //METHOD = FUNCTIONS!!!!!!!!!!

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(reversed));
    }

    public static String reverse(String origin) {
        String reverse = "";
        for (int i = origin.length() - 1; i >= 0; i--) {
            reverse = (reverse + origin.charAt(i));
        }
        return reverse;
    }
}
