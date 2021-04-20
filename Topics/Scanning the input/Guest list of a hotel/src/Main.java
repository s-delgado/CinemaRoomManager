import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        stack.push(scanner.next());
        stack.push(scanner.next());
        stack.push(scanner.next());
        stack.push(scanner.next());
        stack.push(scanner.next());
        stack.push(scanner.next());
        stack.push(scanner.next());
        stack.push(scanner.next());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}