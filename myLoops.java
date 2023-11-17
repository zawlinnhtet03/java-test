import java.util.Scanner;

public class myLoops {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     System.out.println("Hello World");
        // }

        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass")) {
                continue;
            }
            if (input.equals("quit")) {
                break;
            }
            if (!input.equals("quit")) {
                continue;
            }
            System.out.println(input);
        }
    }
}
