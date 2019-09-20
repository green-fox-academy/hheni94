public class DrawChessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        for (int row = 1; row <= 8; row++) {
            for (int column = 1; column <= 8; column++) {
                if (column % 2 == 1 && row % 2 == 1) {
                    System.out.print("%");
                } else if (column % 2 == 1 && row % 2 == 0) {
                    System.out.print(" ");
                } else if (column % 2 == 0 && row % 2 == 1) {
                    System.out.print(" ");
                } else if (column % 2 == 0 && row % 2 == 0) {
                    System.out.print("%");
                }
            }
            System.out.println();
        }
    }
}