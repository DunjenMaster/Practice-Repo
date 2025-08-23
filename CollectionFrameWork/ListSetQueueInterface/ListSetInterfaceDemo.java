/*
* ListIteratorDemo2 Interface extends Collection interface therefore it will have all the methods of collection plus extra method of it as it is ordered so indexing is there.
* Below is the list of ListIteratorDemo2 Interface most commonly used methods:
* 1. add(int index, E e)
* 2. addAll(int index, Collection<E> e)
* 3. remove(int index)
* 4. get(int index)
* 5. set(int index, E e)
* 6. sublist(int from, int to)
* 7. indexOf(Object o)  :-> It will start the searching from the beginning of the list.
* 8. lastIndexOf(Object o)  :-> It will start the searching from the end of the list.
* 9. listIterator() :-> This is bidirectional iterator which can traverse the list in both directions.
* 10. listIterator(int index)
*
* Note: The Set Interface extends Collection interface therefore all the methods of collection interface can be used in it.
*/

package CollectionFrameWork.ListSetQueueInterface;

public class ListSetInterfaceDemo {
    public static void main(String[] args) {
        System.out.println("""
                * 1. add(int index, E e)
                * 2. addAll(int index, Collection<E> e)
                * 3. remove(int index)
                * 4. get(int index)
                * 5. set(int index, E e)
                * 6. sublist(int from, int to)
                * 7. indexOf(Object o)  :-> It will start the searching from the beginning of the list.
                * 8. lastIndexOf(Object o)  :-> It will start the searching from the end of the list.
                * 9. listIterator() :-> This is bidirectional iterator which can traverse the list in both directions.
                * 10. listIterator(int index)
                Note: The Set Interface extends Collection interface therefore all the methods of collection interface can be used in it.""");
    }
}
