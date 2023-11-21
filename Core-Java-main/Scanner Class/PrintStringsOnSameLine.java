package Java;
import java.util.Scanner;
public class PrintStringsOnSameLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string: ");
        String secondString = scanner.nextLine();
        System.out.print("Strings on the same line: "+firstString + " " + secondString);
    }
}

