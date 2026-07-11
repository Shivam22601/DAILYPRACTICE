import java.util.Stack;

public class removemiddle {

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        int size = s.size();

        removeMiddle(s, 0, size);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void removeMiddle(Stack<Integer> s, int count, int size) {

        // Base condition
        if (count == size / 2) {
            s.pop(); // remove middle element
            return;
        }

        int top = s.pop();

        // Recursive call
        removeMiddle(s, count + 1, size);

        // Push remaining elements back
        s.push(top);
    }
}