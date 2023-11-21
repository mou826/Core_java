package Java;
import java.util.Scanner;
public class SwapNumbersUsingThirdVariable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int num3;
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("After swapping, the first number is: " + num1);
        System.out.println("After swapping, the second number is: " + num2);
	}
}
