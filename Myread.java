import java.util.Scanner;

public class Myread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Age: ");
        // byte age = scanner.nextByte();
        // System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are: " + name);
    }
}
