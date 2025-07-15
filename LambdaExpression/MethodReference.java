import javax.sound.sampled.SourceDataLine;

interface MyLambda8
{
    void display(String str);
}


public class MethodReference 
{

    public static void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse(); 
        System.out.println(sb);
    }

    public static void main(String[] args)
    {
        MyLambda8 mL = System.out::println;
        MyLambda8 mL2 = MethodReference::reverse;
        mL.display("Hello, World!");  
        mL2.display("Hello, World!");
    }
}