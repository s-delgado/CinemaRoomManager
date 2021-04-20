import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 0;
        int s = 0;
        int p = 0;
        int print;
        for (int i = 1; i <= n; ++i) {
            print = scanner.nextInt();
            if (print == 1) {
                ++l;
            } else if (print == -1){
                ++s;
            }
            else {
                ++p;
            }
        }
        System.out.println(p + " " + l + " " +s);
    }
}