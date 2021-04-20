import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            else if (num % 2 == 0) {
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
    }
}