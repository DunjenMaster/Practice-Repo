package LambdaExpression;

import java.sql.SQLOutput;

@FunctionalInterface
interface MyLambda5{
    public void display();
}

class UseLambda{
    public void callLambda(MyLambda5 ml)
    {
        ml.display();
    }
}

class Demo5 {
    public void method5()
    {
        UseLambda ul = new UseLambda();
        ul.callLambda(()->{
            System.out.println("Hello from MyLambda5 interface!\nBy Lambda Expression");
        });
    }
}
public class CaptureInLE2 {
}
