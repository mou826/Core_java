package Java;
public class NumberPyramid {
    public static void main(String[] args) {
        int n = 4; // Change this value to control the number of rows in the pyramid
        for (int i = 1; i <= n; i++) {
            // Print leading spaces to center-align the numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print the current number (i) multiple times in the same row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}





