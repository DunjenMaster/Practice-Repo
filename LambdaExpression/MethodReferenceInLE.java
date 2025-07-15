package LambdaExpression;

@FunctionalInterface
interface MyLambda6 {
    public void display(String str);
}

public class MethodReferenceInLE {
    public static void main(String[] args)
    {
        // Using a lambda expression to implement the MyLambda6 interface
        MyLambda6 ml6 = System.out::println; // Method reference to the println method of System.out

        ml6.display("Hello from MyLambda6 interface!\nBy Method Reference in Lambda Expression.");
    };
}