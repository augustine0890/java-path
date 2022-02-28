package com.augustine.ds;

import java.util.*;

public class CollectionsExercise {
    static void addToEndOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.add(i);
    }

    static void addToStartOfLinkedList(LinkedList<Integer> numbers, int i) {
        numbers.addFirst(i);
    }

    static void removeItemFromTopOfStack(Deque<Integer> stack) {
        stack.pop();
    }

    static void removeItemFromFrontOfQueue(Queue<Integer> queue) {
        queue.poll();
    }

    static void addItemToTreeSet(Set<String> set, String item) {
        set.add(item);
    }

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        addToEndOfLinkedList(numbers, 6);
        System.out.println(numbers.getLast());

        addToStartOfLinkedList(numbers, 0);
        System.out.println(numbers.getFirst());

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        removeItemFromTopOfStack(stack);
        System.out.println(stack.peek()); // 4

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        removeItemFromFrontOfQueue(queue);
        System.out.println(queue.peek()); // 2

        Set<String> set = new TreeSet<>();
        set.add("red");
        set.add("orange");
        set.add("yellow");
        addItemToTreeSet(set, "green");
        System.out.println(set.contains("green")); // true
    }
}
