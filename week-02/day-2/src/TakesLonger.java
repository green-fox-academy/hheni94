public class TakesLonger {
    public static void main(String[] args) {

        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String quoteToInsert = " always takes longer than";

        StringBuilder stringbuilder = new StringBuilder(quote);
        int index = quote.indexOf(" you");
        stringbuilder.insert(index , quoteToInsert);
        quote = stringbuilder.toString();

        System.out.println(quote);

    }
}
