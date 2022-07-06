package StackArray;

public class App {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Augustine");
        stack.push("David");

        System.out.println("Stack Size: " + stack.size());
        System.out.println(stack.pop());
        System.out.println("Stack Size: " + stack.size());
    }
}
