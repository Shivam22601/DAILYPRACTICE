// import java.util.HashMap;
// public class validanagram{
//     public boolean isAnagram(String s, String t){
//         if(s.length() != t.length()){
//             return false;
//         }
//         HashMap<Character, Integer> map = new HashMap<>();
//         for(char c : s.toCharArray()){
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
//         for(char c : t.toCharArray()){
//             if(!map.containsKey(c) || map.get(c) == 0){
//                 return false;
//             }
//             map.put(c, map.get(c) - 1);
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         validanagram va = new validanagram();
//         String s = "abcdef";
//         String t = "listen";
//         boolean result = va.isAnagram(s, t);
//         System.out.println("Is anagram: " + result);
//     }}

