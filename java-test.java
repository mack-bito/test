public class BuggyCode {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Bug 1: Off-by-one error (ArrayIndexOutOfBoundsException)
        for (int i = 0; i <= numbers.length; i++) { 
            System.out.println("Number: " + numbers[i]);
        }

        // Bug 2: NullPointerException
        String text = null;
        System.out.println("Length: " + text.length());

        // Bug 3: Logical error (should divide, but using multiplication)
        int a = 10;
        int b = 5;
        int result = a * b;  // Should be a / b
        System.out.println("Division Result: " + result);

        // Bug 4: Unreachable code (after return)
        if (b == 5) {
            return;
            System.out.println("This will never execute!"); // Unreachable
        }
    }
}
