package BST;

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
    private Node<T> root;

    @Override
    public void insert(T data) {
        if (root == null) {
            root = new Node<T>(data);
        } else {
            insertNode(data, root);
        }
    }

    @Override
    public T getMaxValue() {
        if (root == null) {
            return null;
        }
        return getMax(root);
    }

    @Override
    public T getMinValue() {
        if (root == null) {
            return null;
        }
        return getMin(root);
    }

    @Override
    public void traversal() {
        if (root != null) {
            inOrderTraversal(root);
        }
        System.out.println();
    }

    @Override
    public void delete(T data) {
        if (root != null) {
            root = delete(root, data);
        }
    }

    private void inOrderTraversal(Node<T> node) {
        if (node.getLeftNode() != null) {
            inOrderTraversal(node.getLeftNode());
        }

        System.out.print(node + "  -->  ");

        if (node.getRightNode() != null) {
            inOrderTraversal(node.getRightNode());
        }
    }

    private Node<T> delete(Node<T> node, T data) {
        if (node == null) {
            return null;
        }
        if (data.compareTo(node.getData()) < 0) {
            node.setLeftNode(delete(node.getLeftNode(), data));
        } else if (data.compareTo(node.getData()) > 0) {
            node.setRightNode(delete(node.getRightNode(), data));
        } else {
            // We have found the node we want to remove
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                System.out.println("Removing a left node...");
                return null;
            }

            if (node.getLeftNode() == null) {
                System.out.println("Removing the right child...");
                Node<T> tempNode = node.getRightNode();
                node = null;
                return tempNode;
            } else if (node.getRightNode() == null) {
                System.out.println("Removing the left child...");
                Node<T> tempNode = node.getLeftNode();
                node = null;
                return tempNode;
            }

            // This is the node with two children case
            System.out.println("Removing item with two children...");
            Node<T> tempNode = getPredecessor(node.getRightNode());

            node.setData(tempNode.getData());
            node.setLeftNode(delete(node.getLeftNode(), tempNode.getData()));
        }

        return node;
    }

    private Node<T> getPredecessor(Node<T> node) {
        if (node.getRightNode() != null) {
            return getPredecessor(node.getRightNode());
        }
        System.out.println("Predecessor is: " + node);
        return node;
    }

    private void insertNode(T newData, Node<T> node) {
        if (newData.compareTo(node.getData()) < 0) {
            if (node.getLeftNode() != null) {
                insertNode(newData, node.getLeftNode());
            } else {
                Node<T> newNode = new Node<T>(newData);
                node.setLeftNode(newNode);
            }
        } else {
            if (node.getRightNode() != null) {
                insertNode(newData, node.getRightNode());
            } else {
                Node<T> newNode = new Node<T>(newData);
                node.setRightNode(newNode);
            }
        }
    }

    private T getMax(Node<T> node) {
        if (node.getRightNode() != null) {
            return getMax(node.getRightNode());
        }
        return node.getData();
    }

    private T getMin(Node<T> node) {
        if (node.getLeftNode() != null) {
            return getMin(node.getLeftNode());
        }
        return node.getData();
    }
}
