package day01_basics;

public class Swap2_Numbers {
    static void main() {
        int a = 2;
        int b = 3;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The decimal number is "+a);
        System.out.println("The decimal number is "+b);
        int c = 5;
        int d = 10;

        c = c+d;
        d = c-d;
        c =  c-d;
        System.out.println("The decimal number is "+c);
        System.out.println("The decimal number is "+d);
    }
}
