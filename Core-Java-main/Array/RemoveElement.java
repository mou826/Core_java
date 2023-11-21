package Java;
public class RemoveElement {
	 public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int elementToRemove = 3; // Element to remove
	        int[] modifiedArray = removeElement(originalArray, elementToRemove);
	        System.out.println("Modified Array:");
	        for (int element : modifiedArray) {
	            System.out.println(element);
	        }
	    }
	    public static int[] removeElement(int[] array, int element) {
	        int[] modifiedArray = new int[array.length - 1];
	        int newIndex = 0;
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] != element) {
	                modifiedArray[newIndex] = array[i];
	                newIndex++;
	            }
	        }
	        return modifiedArray;
	    }
}