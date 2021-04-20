import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
    	String str = String.format("My age is %d", age);

    	System.out.println(str);
    }
}