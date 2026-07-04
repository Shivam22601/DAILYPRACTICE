import java.util.Stack;
// import java.util.String;
public class reverseString {
    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length() ;i++){
            stack.push(str.charAt(i));
        }
        String reversed = "";
        while(!stack.isEmpty()){
            reversed += stack.pop();
        }
        return reversed;
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        String str = "Hello";
        String result = reverse(str);

        System.out.println("Reversed string: " + result);

        
    }
}