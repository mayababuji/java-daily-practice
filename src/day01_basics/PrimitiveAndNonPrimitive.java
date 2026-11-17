package day01_basics;

public class PrimitiveAndNonPrimitive {

    public static void main(String[] args) {

        // ==========================================
        // 1. PRIMITIVE TYPES
        // Primitives store basic values.
        // They are not objects and do not have methods.
        // ==========================================

        int age = 28;
        double salary = 100.34;
        boolean isActive = true;
        char grade = 'A';

        System.out.println("=== Primitive Types ===");

        // The type labels below are written manually.
        System.out.println("Age: " + age + " | Type: int");
        System.out.println("Salary: " + salary + " | Type: double");
        System.out.println("Active: " + isActive + " | Type: boolean");
        System.out.println("Grade: " + grade + " | Type: char");

        /*
         * IMPORTANT NOTE:
         * Primitive values do not have getClass().
         *
         * These lines will NOT compile:
         *
         * age.getClass();
         * salary.getClass();
         * isActive.getClass();
         * grade.getClass();
         *
         * Keep them commented out.
         */
        // if you want to print the type you will have to cast it to non primitive
        System.out.println("Age Type : " + Integer.valueOf(age).getClass().getSimpleName() + "  | after casting");
        System.out.println("Salary: Type " + Double.valueOf(salary).getClass().getSimpleName() + " | after casting");
        System.out.println("Active Type: " + Boolean.valueOf(isActive).getClass().getSimpleName() + " | after casting");
        System.out.println("Grade Type : " + Character.valueOf(grade).getClass().getSimpleName() + " | after casting ");

        // ==========================================
        // 2. NON-PRIMITIVE / REFERENCE TYPES
        // String and wrapper classes are reference types.
        // getClass() works on these non-null objects.
        // ==========================================

        String name = "Java";
        Integer ageObject = 28;
        Double salaryObject = 100.34;
        Boolean activeObject = true;
        Character gradeObject = 'A';

        System.out.println();
        System.out.println("=== Non-Primitive Types ===");

        System.out.println(
                "Name: " + name
                        + " | Type: " + name.getClass().getSimpleName()
        );

        System.out.println(
                "Age: " + ageObject
                        + " | Type: " + ageObject.getClass().getSimpleName()
        );

        System.out.println(
                "Salary: " + salaryObject
                        + " | Type: " + salaryObject.getClass().getSimpleName()
        );

        System.out.println(
                "Active: " + activeObject
                        + " | Type: " + activeObject.getClass().getSimpleName()
        );

        System.out.println(
                "Grade: " + gradeObject
                        + " | Type: " + gradeObject.getClass().getSimpleName()
        );
    }
}