package ExceptionPractice;

public class Exc1 {
    int area (int l, int b) throws Exception{
        if(l<0 || b<0)
        {
            throw new IllegalArgumentException("Dimension should not be negative");
        }
        int a = l*b;
        return a;
    }

    int meth1() throws  Exception
    {
        int a = area(10,5);
        return  a;

    }

    public static void main(String[] args) throws Exception
    {
        Exc1 obj = new Exc1();
        obj.meth1();
    }

}
