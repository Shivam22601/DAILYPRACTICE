// Stack
import java.util.Stack;
public class PRACTICE{
      public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "({[]})";
        PRACTICE obj = new PRACTICE();
        boolean result = obj.isValid(s);
        System.out.println("Is the string valid? " + result);
    }
}