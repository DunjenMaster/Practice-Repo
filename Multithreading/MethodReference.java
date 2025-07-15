package Multithreading;

@FunctionalInterface
interface check {
    public void checkMethod(String str);
}

public class MethodReference {

    public static void reverse(String str)
    {
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }


    public static void main(String[] args){
        check ck = MethodReference::reverse;
        ck.checkMethod("Hello, this is a method reference example!");
    }

}
