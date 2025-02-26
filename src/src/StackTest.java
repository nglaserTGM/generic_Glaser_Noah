public class StackTest {
    public static void main(String[] args) {
        try {

            System.out.println("Testing Integer Stack:");
            Stack<Integer> numberStack = new Stack<>(3);
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);
            System.out.println("Stack content: " + numberStack.list());

            System.out.println("Popped: " + numberStack.pop());
            System.out.println("Peeked: " + numberStack.peek());
            System.out.println("Stack content: " + numberStack.list());


            System.out.println("\nTesting String Stack:");
            Stack<String> textStack = new Stack<>(2);
            textStack.push("Hello");
            textStack.push("World");
            System.out.println("Stack content: " + textStack.list());

            System.out.println("Popped: " + textStack.pop());
            System.out.println("Peeked: " + textStack.peek());
            System.out.println("Stack content: " + textStack.list());


            System.out.println("\nTesting StackEmptyException:");
            textStack.pop();
            textStack.pop();

        } catch (StackFullException | StackEmptyException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
