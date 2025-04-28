package ExceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class CheckedUnchecked {

    static void fun1()
    {
        try
        {
            try (FileInputStream fi = new FileInputStream("test.txt")) {
                // Perform operations with fi if needed
                System.out.println("File opened successfully");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch (IOException e)
        {
            System.out.println("An I/O error occurred");
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
