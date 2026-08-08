import java.util.Stack;

public class insertatlast {
    public static void insertatlst(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        int temp = s.pop();
        // s.pop();
        insertatlst(s, x);
        s.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        insertatlst(s, 4);
        System.out.println(s);
    }
}