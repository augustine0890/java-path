package StackLinkedList;

public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(5);

        System.out.println("Stack Size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println("Stack Size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println("Is Empty: " + stack.isEmpty());
    }
}
