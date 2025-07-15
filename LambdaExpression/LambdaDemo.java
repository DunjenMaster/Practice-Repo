package LambdaExpression;

//===============================================================================
//Lambda Expression is used for defining anonymous methods/nameless methods.    =
// It is a feature of Java 8 and later versions.                                =
// Lambda Expression can be defined with the help of Interfaces                 =
//===============================================================================


// By Default methods in Interface are abstract and public.
// Note: The below lambda expression is Functional Interface. Because it has only one abstract method. Even if the annotation @FunctionalInterface is not used, it is still a functional interface.

@FunctionalInterface
interface MyLambda {
    // Abstract method
    public void display();
}

/*class My implements MyLambda {
    // Override the abstract method
    @Override
    public void display(){
        System.out.println("Hello from MyLambda interface!");
    }
}
*/

public class LambdaDemo {
    public static void main(String[] args)
    {
        MyLambda m = new MyLambda() {
            public void display()
            {
                System.out.println("Hello from MyLambda interface!\nBy Anonymous InnerClass");
            }
        };
        m.display();
    }
}
