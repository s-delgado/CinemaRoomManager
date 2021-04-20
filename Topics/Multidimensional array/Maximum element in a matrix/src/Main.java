import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int row = 0;
        int col = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int num = scanner.nextInt();
                if (num > max) {
                    max = num;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}