package LambdaExpression;

@FunctionalInterface
interface MultipleParameterIntake {
    public int add(int a, int b);
}

public class LEMultipleParameterIntake {
    public static void main(String[] args) 
    {
        MultipleParameterIntake mp = (a,b) -> {return a+b;};
        System.out.println(mp.add(5,10));
    }
}
