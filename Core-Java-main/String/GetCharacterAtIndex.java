package Java;
public class GetCharacterAtIndex {
    public static void main(String[] args) {
        String text = "Welcome to Java!";
        int index = 9;
        if (index >= 0 && index < text.length()) {
            char character = text.charAt(index);
            System.out.println("Character at index " + index + ": " + character);
        } else {
            System.out.println("Invalid index.");
        }
    }
}