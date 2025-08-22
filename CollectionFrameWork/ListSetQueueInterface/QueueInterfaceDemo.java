/*
* Queue supports the FIFO(First In First Out) principle.
* It extends the Collection Interface therefore it will have all the methods of Collection interface plus its own methods.
* Below is the list of Queue Interface most commonly used methods:
 * 1. add(E e) :-> It will add the element at the end of the queue as it follows FIFO.
 * 2. poll() :-> This will remove the first element from the list per FIFO, if the queue is empty then it will return null.
 * 3. remove() throws NoSuchElementException :-> This is similar to poll() but it will throw an exception if the queue is empty.
 * 4. peek() :-> Before removing any object from the queue if we want to check what we are removing then it will return the first element of the queue without removing it, if the queue is empty then it will return null.
 * 5. element() throws NoSuchElementException :-> This is similar to peek() but it will throw an exception if the queue is empty.
*/

package CollectionFrameWork.ListSetQueueInterface;

public class QueueInterfaceDemo {
    public static void main(String[] args){
        System.out.println("""
                * 1. add(E e) :-> It will add the element at the end of the queue as it follows FIFO.
                 * 2. poll() :-> This will remove the first element from the list per FIFO, if the queue is empty then it will return null.
                 * 3. remove() throws NoSuchElementException :-> This is similar to poll() but it will throw an exception if the queue is empty.
                 * 4. peek() :-> Before removing any object from the queue if we want to check what we are removing then it will return the first element of the queue without removing it, if the queue is empty then it will return null.
                 * 5. element() throws NoSuchElementException :-> This is similar to peek() but it will throw an exception if the queue is empty.
                """);
    }
}
