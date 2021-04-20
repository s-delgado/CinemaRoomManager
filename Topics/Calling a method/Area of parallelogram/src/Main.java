import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int h = scanner.nextInt();
        countAreaOfParallelogram(b, h);
    }

    // Do not change code below   
    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}
