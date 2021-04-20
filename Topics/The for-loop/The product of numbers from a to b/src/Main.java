import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long prod = a;

        for (long i = a + 1; i < b; ++i) {
            prod = prod * i;
        }
        System.out.println(prod);
    }
}