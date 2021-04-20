import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int num;
        do {
            num = scanner.nextInt();
            if (num != 0) {
                ++count;
            }
        } while (num != 0);
        System.out.println(count);
    }
}