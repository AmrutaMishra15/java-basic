public class ExceptionHandlingExamples {
    public static void main(String[] args) {
        // Example 1: ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.err.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block for ArithmeticException");
        }
        System.out.println();

        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } finally {
            System.out.println("Finally block for ArrayIndexOutOfBoundsException");
        }
        System.out.println();

        // Example 3: NullPointerException
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finally block for NullPointerException");
        }
        System.out.println();

        // Example 4: NumberFormatException
        try {
            String value = "abc";
            int number = Integer.parseInt(value);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.err.println("Caught NumberFormatException: " + e.getMessage());
        } finally {
            System.out.println("Finally block for NumberFormatException");
        }
        System.out.println();
    }
}