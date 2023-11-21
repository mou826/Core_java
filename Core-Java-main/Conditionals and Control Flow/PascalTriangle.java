package Java;
public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5; // Change this value to control the number of rows in Pascal's triangle

        int[][] triangle = new int[n][n];

        // Fill in the values for Pascal's triangle
        for (int i = 0; i < n; i++) {
            triangle[i][0] = 1; // First element of each row is 1
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print Pascal's triangle with the desired formatting
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            // Print the values in each row
            for (int j = 0; j <= i; j++) {
                System.out.printf("%2d  ", triangle[i][j]);
            }

            System.out.println();
        }
    }
}
