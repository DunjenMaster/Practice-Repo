package LambdaExpression;


interface MyLambda4 {
    public void display();
}

class Demo
{
    int temp = 10; // This is an instance variable of the class Demo. It can be accessed inside the lambda expression.

    public void method1()
    {
        int count1 = 0; // This is a local variable of the method method1

        MyLambda4 ml4 = () -> {
            int count2 = 0; // This is a local variable of the lambda expression
            count2++; // This line captures the variable 'count' from the enclosing scope
            System.out.println("Hello from MyLambda4 interface!\nBy Lambda Expression");
            System.out.println("Bye from MyLambda4 interface!\nBy Lambda Expression");
            System.out.println("Bye" + count1); // This line uses the captured variable 'count' i.e. the local variable of the method1. Which is not final but effectively final because we are not increasing it at any time in this code. Else if you increase it, it will give compile time error as the variable count1 is not effectively final. It should be declared as final to be used in the lambda expression.
            System.out.println("Bye" + count2); // This line uses the local variable 'count2' of the lambda expression
            System.out.println("Bye" + ++temp); // This line uses the instance variable 'temp' of the class Demo
        };
        ml4.display();
    }
}



public class CaptureInLE {
    public static void main(String[] args){
        Demo d  = new Demo();
        d.method1();
    }
}
