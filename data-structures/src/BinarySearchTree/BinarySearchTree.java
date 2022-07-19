package BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {

    private int nodeCount = 0;

    // The root node
    private Node root = null;

    private class Node {
        T data;
        Node left, right;

        public Node(Node left, Node right, T elem) {
            this.data = elem;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return nodeCount;
    }
}
