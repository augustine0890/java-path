package BST;

public class App {
    public static void main(String[] args) {
        Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        bst.traversal();

        System.out.println("Max Value: " + bst.getMaxValue());
        System.out.println("Min Value: " + bst.getMinValue());

        bst.delete(20);
        bst.traversal();
        bst.delete(30);
        bst.traversal();
        bst.delete(50);
        bst.traversal();
    }
}
