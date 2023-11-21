package Java;
public class ConcatenateStrings {
    public static void main(String[] args) {
        String string1 = "Virat ";
        String string2 = "Kohli";
        // Using the + operator to concatenate
        String concatenatedstring = string1 + string2;
        System.out.println("The concatenated String using + operator is: " + concatenatedstring);
        // Using the concat method to concatenate
        String concat = string1.concat(string2);
        System.out.println("The concatenated String using concat method is: " + concat);
    }
}
