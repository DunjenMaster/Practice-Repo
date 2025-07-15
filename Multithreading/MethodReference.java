package Multithreading;

@FunctionalInterface
interface check {
    public void checkMethod(String str);
}

public class MethodReference {
// This is a method reference to the constructor of MethodReference class, this will print the string in uppercase. and be called as referenced inside main method.
    public MethodReference(String s)
    {
        System.out.println(s.toUpperCase());
    }

    public static void main(String[] args){
// This is a method reference to the constructor of MethodReference class, this will print the string in uppercase.
// Constructor is called with the help of new keyword and the interface is check is taking the reference of the constructor.

        check ck = MethodReference::new;
        ck.checkMethod("Hello, this is a method reference example!");
    }

}
