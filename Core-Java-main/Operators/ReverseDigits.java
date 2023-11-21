package Java;
import java.util.Scanner;
public class ReverseDigits {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a 3-digit number: ");
	        int number = scanner.nextInt();
	            int reversenumber = 0;
	            while (number != 0) {
	                int remainder = number % 10;
	                reversenumber = reversenumber * 10 + remainder;
	                number /= 10;
	            }
	            System.out.println("Reversed number: " + reversenumber);
	        }
	}