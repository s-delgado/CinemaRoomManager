import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int shift = scanner.nextInt();
        int len = array.length;
        shift = shift % len;

        String[] sliceStart = Arrays.copyOfRange(array, len - shift, len);
        String[] sliceEnd = Arrays.copyOfRange(array, 0, len - shift);

        String[] finalArray = new String[len];
        System.arraycopy(sliceStart, 0, finalArray, 0, sliceStart.length);
        System.arraycopy(sliceEnd, 0, finalArray, sliceStart.length, sliceEnd.length);

        System.out.println(Arrays.toString(finalArray)
                .replace(",", "")
                .replace("[", "")
                .replace("]", ""));
    }
}