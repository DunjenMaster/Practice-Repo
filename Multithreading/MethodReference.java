package Multithreading;

@FunctionalInterface
interface check {
    public void checkMethod(String str);
}

public class MethodReference {
// withhout static mehod call the method reference in main class!
    public void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }


    public static void main(String[] args){
        // Using method reference to call the reverse method;  i.e. for non static method create the object and call from it.
        MethodReference mr = new MethodReference();
        check ck = mr::reverse;
        ck.checkMethod("Hello, this is a method reference example!");
    }

}
