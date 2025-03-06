public class Stack<T> {
    // An array to store stack elements (using Object as a generic workaround)
    private Object[] elements;
    // An integer to track the top position in the stack
    private int top;
    // Maximum capacity of the stack
    private int capacity;

    // Constructor that sets stack capacity
    public Stack(int capacity) {
        this.capacity = capacity;
        this.elements = new Object[capacity]; // Creates an array with the given capacity
        this.top = -1; // Stack is empty at the start
    }

    // Default constructor with a capacity of 10
    public Stack() {
        this(10);
    }

    // Method to add an item to the stack
    public void push(T item) throws StackFullException {
        // Check if the stack is full
        if (top == capacity - 1) {
            throw new StackFullException("Stack is full"); // Throw an exception if full
        }
        elements[++top] = item; // Add item and move the top up
    }

    // Method to remove and return the top item from the stack
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        // Check if the stack is empty
        if (top == -1) {
            throw new StackEmptyException("Stack is empty"); // Throw an exception if empty
        }
        return (T) elements[top--]; // Return the top item and move the top down
    }

    // Method to see the top item without removing it
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        // Check if the stack is empty
        if (top == -1) {
            throw new StackEmptyException("Stack is empty"); // Throw an exception if empty
        }
        return (T) elements[top]; // Return the top item without removing it
    }

    // Method to list all items in the stack as a string
    public String list() {
        StringBuilder result = new StringBuilder();
        // Loop through all items in the stack
        for (int i = 0; i <= top; i++) {
            result.append(elements[i]).append(";"); // Add items to the string
        }
        // Remove the last ";" if there are items, or return an empty string
        return result.length() > 0 ? result.substring(0, result.length() - 1) : "";
    }
}