package Multithreading;

/**
 * Functional interface with a single abstract method.
 */
@FunctionalInterface
interface check {
    /**
     * Abstract method to compare two strings.
     *
     * @param str1 The first string to compare.
     * @param str2 The second string to compare.
     * @return An integer result of the comparison.
     */
    public int checkMethod(String str1, String str2);
}

/**
 * Demonstrates method references and functional interfaces in Java.
 */
public class MethodReference {

    /**
     * Constructor that prints the given string in uppercase.
     *
     * @param s The string to be converted to uppercase and printed.
     */
    public MethodReference(String s) {
        System.out.println(s.toUpperCase());
    }

    /**
     * Main method to demonstrate the use of method references.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Using method reference to bind String's compareTo method to the functional interface.
        check ck = String::compareTo;

        // Comparing two strings and printing the result.
        System.out.println(ck.checkMethod("hello", "hello"));
    }
}