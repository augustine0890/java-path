package BinarySearchTree;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Stack;

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

    // Remove a value if it exists, O(n)
    public boolean remove(T elem) {
        if (contains(elem)) {
            root = remove(root, elem);
            nodeCount--;
            return true;
        }
        return false;
    }

    private Node remove(Node node, T elem) {
        if (node == null) return null;

        int cmp = elem.compareTo(node.data);
        if (cmp < 0) {
            node.left = remove(node.left, elem);
        } else if (cmp > 0) {
            node.right = remove(node.right, elem);
        // Found the node we wish to remove
        } else {
            // Only a right subtree. Swap the node we wish to remove with its right child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                // Find the leftmost node in the right subtree
                Node tmp = findMin(node.right);
                // Swap the data
                node.data = tmp.data;
                // Go into the right subtree and remove the leftmost node we found and swapped data with.
                node.right = remove(node.right, tmp.data);

                /*
                 Find the largest node in the left subtree
                 Node tmp = findMax(node.left);
                 node.data = tmp.data;
                 node.left = remove(node.left, tmp.data);
                */
            }
        }

        return node;
    }

    // Find the leftmost (the smallest value)
    private Node findMin(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // Find the rightmost (the largest value)
    private Node findMax(Node node) {
        while (node.right != null) node = node.right;
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

    // Computes the height of the tree, O(n)
    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) return 0;
        return Math.max(height(node.right), height(node.left)) + 1;
    }

    // This method returns an iterator
    public Iterator<T> traverse(TreeTraversalOrder order) {
        switch (order) {
            case PRE_ORDER:
                return preOrderTraversal();
            default:
                return null;
        }
    }

    // Returns as iterator to traverse the tree in pre-order
    private Iterator<T> preOrderTraversal() {
        final int expectedNodeCount = nodeCount;
        final Stack<Node> stack = new Stack<>();
        stack.push(root);

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                return root != null && !stack.isEmpty();
            }

            @Override
            public T next() {
                if (expectedNodeCount != nodeCount) throw new ConcurrentModificationException();
                Node node = stack.pop();
                if (node.right != null) stack.push(node.right);
                if (node.left != null) stack.push(node.left);
                return node.data;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);
        bst.add(70);
        bst.add(60);
        bst.add(80);

        int count = bst.size();
        Iterator preOrder = bst.traverse(TreeTraversalOrder.PRE_ORDER);
        StringBuilder sb = new StringBuilder(count).append("[");
        while (count > 1) {
            sb.append(preOrder.next() + " --> ");
            count--;
        }
        sb.append(preOrder.next() + "]");
        System.out.println(sb);
    }
}
