import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long i = 1;
        for (long j = 2; j <= n; ++j) {
            i *= j;
        }
        return i;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}