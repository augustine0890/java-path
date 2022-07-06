import java.util.List;

public class App {

    public static void main(String[] args) {

        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.insert(0);
        myLinkedList.insert(1);
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(4);
        myLinkedList.insert(5);

        myLinkedList.remove(0);

        myLinkedList.traverseList();

        System.out.println(myLinkedList.getMiddle().toString());
    }
}
