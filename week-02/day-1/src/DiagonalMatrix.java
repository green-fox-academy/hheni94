// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output

public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] twoDArray = new int[4][4];

        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray.length; j++) {
                if (i == j) {
                    twoDArray[i][j] = 1;
                }
                else {
                    twoDArray[i][j] = 0;
                }
                System.out.print(twoDArray[i][j]);
            }
            System.out.println();
        }
    }
}
