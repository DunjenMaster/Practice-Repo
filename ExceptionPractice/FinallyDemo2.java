package ExceptionPractice;

import java.io.FileReader;

public class FinallyDemo2 {
    static void meth1() throws Exception
    {
        try {
            throw new Exception();
        }
        finally {
            System.out.println("finally in meth1");
        }
    }

    public static void main(String[] args) throws Exception
    {
    meth1();
    }

    String meth2() throws Exception{
        String result=null;
        try(FileReader f = new FileReader("my.txt")){
            return  result;
        }
    }
}
