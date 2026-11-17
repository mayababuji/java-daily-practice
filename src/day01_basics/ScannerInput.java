package day01_basics;
import java.util.Scanner;
public class ScannerInput {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Enter your gender: ");
        String gender = sc.next();
        System.out.println("age"+age+"gender "+gender+"name"+name);
    }
}
