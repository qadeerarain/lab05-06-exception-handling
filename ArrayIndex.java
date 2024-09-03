import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        // Initialize the array
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the index to access the array:");
        int index = scanner.nextInt();

        try {
            int value = numbers[index];
            System.out.println("Element at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index " + index + " is out of bounds. Please enter a valid index.");
        }

        scanner.close();
    }
}
