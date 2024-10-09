import java.util.ArrayList;

public class p38 {
    private ArrayList<Object> list = new ArrayList<>();

    // Checks if the stack is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Returns the size of the stack
    public int getSize() {
        return list.size();
    }

    // Returns the top element of the stack without removing it
    public Object peek() {
        if (!isEmpty()) {
            return list.get(getSize() - 1);
        }
        return null;
    }

    // Removes and returns the top element of the stack
    public Object pop() {
        if (!isEmpty()) {
            return list.remove(getSize() - 1);
        }
        return null;
    }

    // Adds an element to the top of the stack
    public void push(Object o) {
        list.add(o);
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());  // 30
        System.out.println("Pop element: " + stack.pop());   // 30
        System.out.println("Stack size: " + stack.getSize()); // 2
    }
}
