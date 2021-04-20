import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void exchange(int i, int j, int[] numbers) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    private static void quicksort(int low, int high, int[] numbers) {
        int i = low, j = high;
        // Get the pivot element from the middle of the list
        int pivot = numbers[low + (high - low) / 2];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (numbers[i] < pivot) {
                i++;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (numbers[j] > pivot) {
                j--;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                exchange(i, j, numbers);
                i++;
                j--;
            }
        }
        // Recursion
        if (low < j)
            quicksort(low, j, numbers);
        if (i < high)
            quicksort(i, high, numbers);
    }

    public static void sort(int[] numbers) {
        if (numbers.length <= 1) {
            return;
        }
        quicksort(0, numbers.length - 1, numbers);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split("\\s+");
        int[] numbers = Arrays.stream(values)
                .mapToInt(Integer::parseInt)
                .toArray();
        sort(numbers);
        Arrays.stream(numbers).forEach(e -> System.out.print(e + " "));
    }
}