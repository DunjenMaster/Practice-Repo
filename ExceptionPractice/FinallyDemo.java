package ExceptionPractice;

public class FinallyDemo {
    public static void main(String[] args) throws Exception
/*
    {
        System.out.println(10/0); // The compiler will throw an ArithmeticException error here and not proceed further.

        System.out.println("Final Message");
    }
    {
        try {
            System.out.println(10 / 0); // This will throw an ArithmeticException but still it will execute the finally block
        } finally
        {
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }
    {
        try {
            System.out.println(10 / 0); // This will throw an ArithmeticException but still it will execute the finally block
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e);
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }
    }
*/ {
        try {
            System.out.println(10 / 0); // This will throw an ArithmeticException but still it will execute the finally block
        }
        catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException caught: " + e);
        }
        // Exception has  been handled in the catch block so the below will be executed
        System.out.println("Hey there !");
    }
}
