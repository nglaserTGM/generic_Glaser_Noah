public class Stack<T> {
    private Object[] elements; // Generic array workaround
    private int top;
    private int capacity;

    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity];
        this.top = -1;
    }

    public Stack() {
        this(10);
    }



}
