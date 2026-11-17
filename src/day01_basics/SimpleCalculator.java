package day01_basics;
import java.util.Scanner;
public class SimpleCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter 1 for addiditon 2 for subtraction 3 for division: ");
        int option = sc.nextInt();
        int result ;
        if (option == 1) {
             result = a + b;

        }
       else  if (option == 2) {
             result = a - b;

        }
       else if (option == 3) {
             result = a / b;

        }
       else{
           System.out.println("Invalid option");
           sc.close();
           return;
        }
        System.out.println(result);
       sc.close();

    }
}

