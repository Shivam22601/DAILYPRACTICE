import java.util.Stack;
public class validparanthesis{

    public static boolean isvalid(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i <s.length() ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            }
            else{
                if(!st.isEmpty()){
                     char top = st.pop();
                     if(c == ')' && top != '(') return false;
                     if(c == '}' && top != '{') return false;   
                     if(c == ']' && top != '[') return false;

                 }
                 else{
                    return false;
                 }
               
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isvalid(s));
    }
}