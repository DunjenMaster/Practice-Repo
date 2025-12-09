package LambdaExpression;


@FunctionalInterface
interface MyLambda7{
    public void display(String str);
}

public class MethodReferenceInLE2 {
    public static void reverseCheck(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args)
    {
        MyLambda7 ml7 = MethodReferenceInLE2::reverseCheck; // Method reference to the reverseCheck method of MethodReferenceInLE2 class

        ml7.display("Hello from MyLambda7 interface!\nBy Method Reference in Lambda Expression. With the help of static method reference.");

    }
}
