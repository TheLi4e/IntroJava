public class Queue {
    private static Node rear = null, front = null;
    private static int count = 0;

    public static int dequeue()
    {
        if (front == null)
        {
            System.out.println("\nОчередь пуста");
            System.exit(-1);
        }

        Node temp = front;
        System.out.printf("Удаляем %d\n", temp.data);
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count -= 1;
        return temp.data;
    }

    public static void enqueue(int item)
    {
        Node node = new Node(item);
        System.out.printf("Добавляем %d\n", item);
        if (front == null)
        {
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
        count += 1;
    }

    public static int first()
    {
        if (front == null) {
            System.exit(-1);
        }
        return front.data;
    }

    public static boolean isEmpty() {
        return rear == null && front == null;
    }

    private static int size() {
        return count;
    }
}
