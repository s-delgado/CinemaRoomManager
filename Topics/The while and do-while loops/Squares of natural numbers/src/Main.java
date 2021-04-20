import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int square = i;
        while (square <= n) {
            square = i * i;
            if (square <= n) {
                System.out.println(square);
            }
            ++i;
        }
    }
}