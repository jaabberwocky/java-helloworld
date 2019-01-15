import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTutorial {

    public static void main(String[] args) {
        // arrays' size cant be changed once created

        int[] numbers = {31,45,22,98,10};

        // pretty prints the java array
        System.out.println(Arrays.toString(numbers));

        // sort the array now
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);
        System.out.println("Sorted!");
        System.out.println(Arrays.toString(sorted));

        // get method
        System.out.println("Print index 2:");
        System.out.println(Array.get(numbers, 2));
    }
}
