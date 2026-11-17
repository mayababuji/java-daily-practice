package day01_basics;
import java.util.Scanner;
public class ArithmeticOperators {
    static void main() {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the first Number : ");
     int num = sc.nextInt();
     System.out.println("Enter the second Number : ");
     int num2 = sc.nextInt();
     System.out.println("Sum is " +(num2+num));
     System.out.println("Difference is "+(num2-num));
     System.out.println("Product is "+(num2*num));
     System.out.println("Remainder is "+(num2%num));
     System.out.println("Quotient  is "+(num2/num));

    }
}
