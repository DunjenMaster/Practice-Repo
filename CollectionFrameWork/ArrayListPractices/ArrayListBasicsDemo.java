package CollectionFrameWork.ArrayListPractices;
import java.util.ArrayList;
import java.util.List;

public class ArrayListBasicsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>(20);
        al1.add(21);
        al1.add(0, 22);
        System.out.println("ArrayList al1: " + al1);

        ArrayList<Integer> al2 = new ArrayList<>(List.of(20, 30, 40, 50, 60));
        al1.addAll(0, al2);
        System.out.println("ArrayList al1 after adding al2: " + al1);
        System.out.println(al2.contains(80) ? "80 is present in al2" : "80 is not present in al2");
        System.out.println(al2.containsAll(al1)? "al2 contains all the elements of the al1" : "al2 does not contains all the elements of al1");
        System.out.println(al2.get(3));
        System.out.println(al2.indexOf(50));
    }
}