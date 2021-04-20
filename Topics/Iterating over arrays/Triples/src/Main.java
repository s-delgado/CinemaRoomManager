import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a1;
        int a2;
        int a3;
        int triplets = 0;

        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] numbers = new int[len];
        for (int i = 0; i < len; ++i) {
            numbers[i] = scanner.nextInt();
        }
        for (int j = 2; j < len; ++j) {
            a1 = numbers[j - 2];
            a2 = numbers[j - 1];
            a3 = numbers[j];
            if (a1 + 1 == a2 && a2 + 1 == a3) {
                ++triplets;
            }
        }
        System.out.println(triplets);
    }
}