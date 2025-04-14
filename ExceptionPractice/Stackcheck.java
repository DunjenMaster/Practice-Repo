package ExceptionPractice;


class StackOverFlowException extends Exception {
    public String toString ()
    {
        return "StackOverflowError: Stack Overflown now there is no more space left!";
    }
}

class StackUnderFlowException extends Exception {
    public String toString()
    {
        return "Stack is empty you idiot!";
    }
}

class Stack
{
    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz){
        size = sz;
        S= new int [sz];
    }

    public void push(int x) throws StackOverFlowException
    {
        if (top == size -1)
            throw new StackOverFlowException();
        top++;
        S[top] = x;
    }

    public int pop(int i)
            throws StackUnderFlowException
    {
        int x = -1;
        if(top == -1)throw new StackUnderFlowException();
        x = S [top];
        top--;
        return x;
    }
}

public class Stackcheck {
    public static void main(String[] args){
        Stack st = new Stack(5);
        try {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
        }catch (StackOverFlowException e){
            System.out.println(e);
        }

        try {
            st.pop(10);
            st.pop(20);
            st.pop(30);
            st.pop(40);
            st.pop(50);
        } catch (StackUnderFlowException e) {
            System.out.println(e);
        }
    }
}
