package LambdaExpression;

@FunctionalInterface
interface MyLambda3 {
    public void display(String str);
}

public class LambdaExpressionParameterIntake {
    public static void main(String[] args)
    {
        MyLambda3 m3 = (s) -> {System.out.println(s);};
        m3.display("Hello, Lambda Expressions With Parameter Intake!");
    }
}
