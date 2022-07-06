package Queue;

public class App {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Queue Size: " + queue.size());
    }
}
