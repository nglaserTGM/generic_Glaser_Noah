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
    public void push(T item) throws StackFullException {
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full");
        }
        elements[++top] = item;
    }


    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top--];
    }


    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if (top == -1) {
            throw new StackEmptyException("Stack is empty");
        }
        return (T) elements[top];
    }


    public String list() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            result.append(elements[i]).append(";");
        }
        return result.length() > 0 ? result.substring(0, result.length() - 1) : "";
    }


}
