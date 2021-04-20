import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        if (x1 == x2 || y1 == y2) {
            System.out.println("YES");
        } else if (Math.abs((y2-y1)/(x2-x1)) == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}