import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        String cat;
        if (units < 1) {
            cat = "no army";
        } else if (units <= 19) {
            cat = "pack";
        } else if (units <= 249) {
            cat = "throng";
        } else if (units <= 999) {
            cat = "zounds";
        } else {
            cat = "legion";
        }
        System.out.println(cat);
    }
}