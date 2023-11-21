package Java;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        if (num1 > num2)
           if (num1 > num3)
        	   System.out.println("The greatest number is: " + num1);
        if (num2 > num1)
           if (num2 > num3)
        	    System.out.println("The greatestnumber is: " + num2); 
        if (num3 > num1)
           if (num3 > num2)
        	    System.out.println("The greatest number is: " + num3);
    }
    }

