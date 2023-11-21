package Java;
public class ReplaceCharacter {
	public static void main(String[] args) {
        String string1 = "World Cup";
        char char1 = 'u'; 
        char char2 = 'o';
        String string2 = string1.replace(char1, char2);
        System.out.println("The original String is : " + string1);
        System.out.println("The replaced String is : " + string2);
    }
}
