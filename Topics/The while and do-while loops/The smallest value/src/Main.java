import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 1;
        long factor = 2;
        while (n <= m) {
            n *= factor;
            ++factor;
        }
        System.out.println(factor - 1);
    }
}