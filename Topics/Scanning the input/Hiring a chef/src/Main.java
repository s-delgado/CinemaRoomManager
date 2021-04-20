import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String age = scanner.nextLine();
        String stage = scanner.nextLine();
        String years = scanner.nextLine();
        String cuisine = scanner.nextLine();

        System.out.format("The form for %s is completed. We will contact ", name);
        System.out.format("you if we need a chef that cooks %s dishes.", cuisine);
    }
}