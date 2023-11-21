package Java;
public class CheckSpecifiedSequence {
	public static void main(String[] args) {
        String string1 = "The earth is round";
        String stringcheck = "Earth";
        boolean stringcontains = string1.contains(stringcheck);
        if (stringcontains) {
            System.out.println("The string contains the specified sequence.");
        } else {
            System.out.println("The string does not contain the specified sequence.");
        }
    }
}