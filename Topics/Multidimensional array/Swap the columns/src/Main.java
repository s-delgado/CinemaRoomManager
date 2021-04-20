import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int swapOne;
        int swapTwo;
        for (int k = 0; k < n; ++k) {
            swapOne = arr[k][i];
            swapTwo = arr[k][j];

            arr[k][j] = swapOne;
            arr[k][i] = swapTwo;
        }
        for (int k = 0; k < n; ++k) {
            System.out.println(Arrays.toString(arr[k])
                    .replace(",", "")
                    .replace("[", "")
                    .replace("]", ""));
        }
    }
}