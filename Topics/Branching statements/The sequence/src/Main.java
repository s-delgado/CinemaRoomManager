import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        boolean stopped = false;
        for (int i = 1; !stopped; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(i + " ");
                ++count;
                if (count >= n) {
                    stopped = true;
                    break;
                }
            }
        }
    }
}