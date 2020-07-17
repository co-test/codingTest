package bbbnam;

public class NewStack<T> {
    private Node<T> top;

    class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> node = new Node<T>(item);
        node.next = top;
        top = node;
    }

    public T pop() {
        if (top == null){
            throw new NullPointerException();
        }
        T resultData = top.data;
        top = top.next;
        return resultData;
    }

    public T peek() {
        if (top == null){
            throw new NullPointerException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
