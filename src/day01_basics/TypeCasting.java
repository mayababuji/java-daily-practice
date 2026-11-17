package day01_basics;

public class TypeCasting {
    static void main() {
        int wholeNumber = 10;
        double decimalNumber = wholeNumber;
        double price = 99.99;
        int roundedPrice = (int) price;
        System.out.println("The price is "+roundedPrice);
        System.out.println("The decimal number is "+decimalNumber);
    }
}
