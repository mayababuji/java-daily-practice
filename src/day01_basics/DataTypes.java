package day01_basics;
/*
 * NOTE:
 * Primitive variables do not have getClass().
 *
 * smallNumber.getClass(); // Does not compile
 *
 * Wrapper objects support getClass().
 *
 * smallNumberObject.getClass(); // Works
 *
 * The original smallNumber variable is still a byte.
 * Autoboxing does not change its declared type.
 */

public class DataTypes {
    static void main() {
        byte smallNumber =10;
        short mediumNumber = 30000;
        int wholeNumber = 100000;

        long bigNumber = 10000000000L;
        float price = 19.99f;
        double precisePrice = 19.999999;
        char initial = 'J';
        boolean isActive = true;

        System.out.println("byte: " + smallNumber);
        System.out.println("short: " + mediumNumber);
        System.out.println("int: " + wholeNumber);
        System.out.println("long: " + bigNumber);
        System.out.println("float: " + price);
        System.out.println("double: " + precisePrice);
        System.out.println("char: " + initial);
        System.out.println("boolean: " + isActive);

        System.out.println("Type of smallNumber is : " + Byte.valueOf(smallNumber).getClass().getSimpleName() );
        System.out.println("Type of mediumNumber is "+ Short.valueOf(mediumNumber).getClass().getSimpleName());
        System.out.println("Type of wholeNumber is "+ Integer.valueOf(wholeNumber).getClass().getSimpleName());
        System.out.println("Type of bigNumber is "+ Long.valueOf(bigNumber).getClass().getSimpleName());
        System.out.println("Type of price is "+ Double.valueOf(price).getClass().getSimpleName());
        System.out.println("Type of initial is "+ Character.valueOf(initial).getClass().getSimpleName());
        System.out.println("Type of isActive is "+ Boolean.valueOf(isActive).getClass().getSimpleName());


    }
}
