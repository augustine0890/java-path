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

    // Returns true if successfully inserted
    public boolean add(T elem) {
        if (contains(elem)) {
            return false;
        } else {
            root = add(root, elem);
            nodeCount++;
            return true;
        }
    }

    // Private method to add a value in the Binary Tree
    private Node add(Node node, T elem) {
        if (node == null) {
            node = new Node(null, null, elem);
        } else {
            if (elem.compareTo(node.data) < 0) {
                node.left = add(node.left, elem);
            } else {
                node.right = add(node.right, elem);
            }
        }
        return node;
    }

    // Returns true is the element exists in the tree
    public boolean contains(T elem) {
        return contains(root, elem);
    }

    // Find an element in the tree
    private boolean contains(Node node, T elem) {
        if (node == null) return false;

        int cmp = elem.compareTo(node.data);
        if (cmp < 0) return contains(node.left, elem);
        else if (cmp > 0) return contains(node.right, elem);
        else return true;
    }
}
