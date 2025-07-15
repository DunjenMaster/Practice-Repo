package LambdaExpression;

@FunctionalInterface
interface MyLambda2 {
    // Abstract method
    public void display();
}

/*
Note: 1. Because the interface MyLambda2 has only one abstract method, it is a functional interface.
      2. Due to this the lambda expression can be used to implement the method of this interface as it knows there is only one method inside it.
      3. The () -> { } syntax is used to define the lambda expression.
      4. And () is used to denote that there are no parameters for the method display().
 This is a simple example of using a lambda expression to implement a functional interface.
*/

public class LambdaExpressionImplementation {
    public static void main(String[] args){
        MyLambda2 m2 = () ->
        {
            System.out.println("Hello from MyLambda2 interface!\nBy Lambda Expression");
        };
        m2.display();
    }
}
