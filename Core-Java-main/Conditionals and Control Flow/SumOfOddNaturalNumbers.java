package Java;
import java.util.Scanner;

public class SumOfOddNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        scanner.close();
        int sum = 0;
        int number = 1; 
        for (int i = 0; i < n; i++) {
            sum += number;
            number += 2; 
        }
        System.out.println("The sum of the first " + n + " odd natural numbers is: " + sum);
    }
}
