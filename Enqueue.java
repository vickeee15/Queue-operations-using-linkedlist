public class Enqueue<T> {
    public Node<T> front;
    public Node<T> rear;
    public int length;
    /* Method to EnQueue or insert an Item in Queue(rear)*/
    public void enQueue(T item) {
        if (front == null) {
            rear = new Node<T>(item);
            front = rear;
        } else {
            rear.next = new Node<T>(item);
            rear = rear.next;
        }
        length++;
    }
    public int size() {
        return length;
    }

    public void displayQueue() {
        Node<T> currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
    }
}
