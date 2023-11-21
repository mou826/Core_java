package Java;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class CommonElements {
	public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 6, 7, 8, 9};
        List<Integer> commonElements = findCommonElements(array1, array2);
        System.out.println("Common elements between the two arrays: " + commonElements);
    }
    public static List<Integer> findCommonElements(int[] array1, int[] array2) {
        List<Integer> commonElementsList = new ArrayList<>();
        Arrays.sort(array1); // Sort the arrays for efficient comparison
        Arrays.sort(array2);
        int i = 0; // Index for array1
        int j = 0; // Index for array2
        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                commonElementsList.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return commonElementsList;
    }
}