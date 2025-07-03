package CollectionFrameWork.ArrayListPractices;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        al1.add(21);
        al1.add(0, 22);
        System.out.println("ArrayList al1: " + al1);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(20, 30, 40, 50, 60));
        al1.addAll(0, al2);
        System.out.println("ArrayList al1 after adding al2: " + al1);
    }
}