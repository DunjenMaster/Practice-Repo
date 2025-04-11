package ExceptionPractice;

// This program demonstrates the use of throw and throws keywords in Java for Checked Exceptions.
public class ThrowThrowsDemo {

    static int meth1(){
        return 10/0; // This will throw an ArithmeticException
    }

    static void meth2(){
        meth1();
    }

    static void meth3(){
        meth2();
    }

    public static void main(String[] args)
    {
        try{
            meth3();
        }catch(Exception e){
            System.out.println("Exception handled in main method");
            System.out.println(e);
        }
    }
}
