import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean asc = true;
        boolean dsc = true;
        int prevSmall = -1;
        int prevBig = -1;
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (prevBig == -1) {
                prevSmall = n;
                prevBig = n;
                continue;
            }
            if (n == 0) {
                break;
            }

            if (n >= prevSmall && asc == true) {
                asc = true;
                prevSmall = n;
            } else {
                asc = false;
            }
            if (n <= prevBig && dsc == true) {
                dsc = true;
                prevBig = n;
            } else {
                dsc = false;
            }
        }
        System.out.println(asc || dsc);
    }
}