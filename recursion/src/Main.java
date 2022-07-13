import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        System.out.println("Size of linkedList: " + lengthOfList(numbers));
    }

    public static int lengthOfList(LinkedList ll) {
        int count = 0;
        ListIterator listIter = ll.listIterator(count);
        while (listIter.hasNext()) {
            count += 1;
            listIter = ll.listIterator(count);
        }
        return count;
    }
}
