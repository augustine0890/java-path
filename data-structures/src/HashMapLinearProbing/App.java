package HashMapLinearProbing;

public class App {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        hashTable.put(1, 100);
        System.out.println();

        hashTable.put(1, 201);
        System.out.println();

        hashTable.put(3, 301);
        System.out.println();

        System.out.println(hashTable.get(1));
        System.out.println(hashTable.get(3));
    }
}
