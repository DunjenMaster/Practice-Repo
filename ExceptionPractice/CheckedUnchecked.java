package ExceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class CheckedUnchecked {

    static void fun1()
    {
        try
        {
            FileInputStream fi = new FileInputStream("test.txt");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
    }

    static void fun2(){
        fun1(); 
    }

    static void fun3(){
        fun2();
    }

    public static void main(String[] args) {
        fun3();

    }
}
