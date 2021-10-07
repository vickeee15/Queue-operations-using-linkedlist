import java.util.Queue;

public class MainClass {
    public static void main(String[] args) {

        Enqueue<Integer> queue = new Enqueue<>();
        queue.enQueue(56);
        queue.enQueue(30);
        queue.enQueue(70);
        queue.displayQueue();
    }
}
