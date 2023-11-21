package Java;
public class CompareStrings {
	public static void main(String[] args) {
        String string1 = "India";
        String string2 = "iNDIA";
        boolean isequal = string1.equalsIgnoreCase(string2);
        if (isequal) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }
}