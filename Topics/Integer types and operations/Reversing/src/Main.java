import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int hundred = num / 100;
        int tenth = num % 100 / 10;
        int sin = num % 10;
        System.out.println(sin*100 + tenth*10 + hundred);
    }
}