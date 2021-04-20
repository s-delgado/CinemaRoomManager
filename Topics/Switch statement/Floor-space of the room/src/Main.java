import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.next();
        switch (figure) {
            case "triangle":
                float a = scanner.nextFloat();
                float b = scanner.nextFloat();
                float c = scanner.nextFloat();
                float p = (a + b + c) / 2;
                System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
                break;
            case "rectangle":
                float a2 = scanner.nextFloat();
                float b2 = scanner.nextFloat();
                System.out.println(a2 * b2);
                break;
            case "circle":
                float r = scanner.nextFloat();
                System.out.println(3.14 * (r * r));
                break;
            default:
                System.out.println("error!");
        }
    }
}