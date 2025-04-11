package ExceptionPractice;

// This is a custom unchecked exception class
class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class ThrowThrowsDemo2
{
    static int area (int l, int b) throws  NegativeDimensionException
    {
        if(l < 0 || b < 0)
            throw new NegativeDimensionException();
        return l * b;
    }
    static void meth1() throws NegativeDimensionException
    {
        System.out.println("Area is: "+ area(-10,5));
    }



// This program demonstrates the use of throw and throws keywords in Java for Unchecked Exceptions.
//public class ThrowThrowsDemo2
//{
//    static int area (int l, int b) throws  Exception
//    {
//        if(l < 0 || b < 0)
//            throw new Exception("Length and breadth must be positive");
//        return l * b;
//    }
//    static void meth1() throws Exception
//    {
//        System.out.println("Area is: "+ area(10,5));
//    }
//
    public static void main(String[] args)
    {
        try {
            meth1();
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }
    }
}
