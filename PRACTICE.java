
// import java.util.Scanner;

// import java.util.HashMap;
// public class PRACTICE{
    
//     public int[] PRATICE(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i< nums.length; i++){
//             int second = target - nums[i];
//             if(map.containsKey(second)){
//                 return new int[]{ 
//                     map.get(second),i
//                     };
//             }
//                 map.put(nums[i],i);
//             }
//             return new int[]{};
//     }

//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = practice.PRATICE(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
// }

//contains duplicate
//     public boolean containsDuplicate(int[] nums){
//         HashSet<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)){
//                 return true;
//             }
//             set.add(num);
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {1,2,3,4,5,6,2};
//         boolean result = practice.containsDuplicate(nums);
//         System.out.println("Contains duplicate: " + result);
//     }
// }

// single number
// public class PRACTICE{
//     public int singleNumber(int[] nums){
//         int xor = 0;
//         for(int num : nums){
//             xor ^= num;
//         }
//         return xor;
//     }

//     public static void main(String[] atgs){
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {4,1,2,1,2};
//         int result = practice.singleNumber(nums);
//         System.out.println("Single number: " + result);
//     }
// }

//Majority element by two pointers
// public class PRACTICE{
//     public int majorityElement(int[] nums){
//        int element = 0;
//        int count = 0;
//        for (int num : nums){
//         if(count == 0){
//             element = num;
//         }
//         if(num == element){
//             count++;
//         }else{
//             count--;
//         }
//        }
//        return element;
//     }

//     public static void main(String[] atgs){
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {4,1,2,1,2};
//         int result = practice.majorityElement(nums);
//         System.out.println("Majority element: " + result);
//     }
// }

//majority element by hashmap
// import java.util.HashMap;
// public class PRACTICE{
//     public static int majorityElement(int[] nums){
//       HashMap<Integer, Integer> map = new HashMap<>();
//       int n = nums.length;
//     for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if (map.get(num) > n / 2) {
//                 return num;
//             }
//         }
//        return -1;
//     }

//     public static void main(String[] args){
//         int[] nums = {2, 2, 1, 1, 1, 2, 2};
//         System.out.println(PRACTICE.majorityElement(nums));
//     }
// }
// import java.util.*;
// public class PRACTICE{
//     public static int instersection(int[] nums1, int[] nums2){
//       Set<Integer> set1 = new HashSet<>();
//       int n = nums1.length;
//     for (int num : nums1) {
//            set1.add(num);
//         }
//      Set<Integer> result = new HashSet<>();
//     for(int num : nums2){
//         if(set1.contains(num)){
//             result.add(num);
//         }
//     }
// int[] ans = new int[result.size()];
// int index = 0;
// for (int val : result){
//     ans[index++] = val;
// }
// return ans[0];
//     }

//     public static void main(String[] args){
//         int[] nums1 = {1, 2, 2, 1};
//         int[] nums2 = {2, 2};
//         System.out.println(PRACTICE.instersection(nums1, nums2));
//     }
// }

// valid anagram
// import java.util.*;
// public class PRACTICE{
//     public static boolean isAnagram(String s, String t){
//         if(s.length() != t.length()){
//             return false;
//         }
//         int count[] = new int[26];

//         for(char c : s.toCharArray()){
//             count[c - 'a']++;
//         }

//         for(char c : t.toCharArray()){
//             count[c - 'a']--;
//         }

//         for (int c : count){
//             if(c != 0 ){
//                 return false;
//             }
//         }

//         return true;

//     }

//     public static void main(String[] args){
//         String s = "anagram";
//         String t = "nagaram";
//         System.out.println(PRACTICE.isAnagram(s, t));
//     }
// }

// isomorphic strings
// import java.util.*;
// public class PRACTICE{
//     public static boolean isIsomorphic(String s, String t){
//         if(s.length() != t.length()) return false;
//         int[] maps = new int[256];
//         int[] mapt = new int[256];
//         for(int i =0 ; i < s.length() ; i++){
//             char c1 = s.charAt(i);
//             char c2 = t.charAt(i);
//             if(maps[c1] != mapt[c2]){
//                 return false;
//             }
//             maps[c1] = i+1;
//             mapt[c2] = i+1;
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         String s = "egg";
//         String t = "add";
//         System.out.println(PRACTICE.isIsomorphic(s,t));
// }
// }

//REVERSE STRING
// import java.util.*;
// public class PRACTICE{
//     public static void reverseString(char[] s){
//         int left = 0;
//         int right = s.length -  1;
//         while(left < right){
//             char temp = s[left];
//             s[left] = s[right];
//             s[right] = temp;
//             left++;
//             right--;
//         }
//         return;
//     }

//     public static void main(String[] args) {
//         char[] s = {'h', 'e', 'l', 'l', 'o'};
//         reverseString(s);
//         System.out.println("Reversed string: " + new String(s));
//     }
// }

//Move Zeros
// import java.util.*;
// public class PRACTICE{
//     public void moveZeroes(int[] nums){
//         int insert = 0;
//         for(int num : nums){
//             if(num != 0){
//                 nums[insert++] = num;
//             }
//         }
//         while(insert < nums.length){
//             nums[insert++] = 0;
//         }
//     }

//     public static void main(String[] args){
//         int[] nums = {0,1,0, 3, 0, 1,0,2};
//         PRACTICE practice = new PRACTICE();
//         practice.moveZeroes(nums);
//         System.out.println("After moving zeros: " + Arrays.toString(nums));
//     }
// }

//remove element
// import java.util.*;
// public class PRACTICE{
//     public int removeElement(int[] nums, int val){
//         int insert = 0;
//         for(int num : nums){
//             if(num != val){
//                 nums[insert] = num;
//                 insert++;
//             }
//         }
//         return insert;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5,6,6};
//         int val = 2;
//         PRACTICE practice = new PRACTICE();
//         int k = practice.removeElement(nums, val);
//         for(int i=0; i< k; i++){
//             System.out.print(nums[i] + " ");
//         }
//     }
// }

//remove duplicates
// import java.util.*;
// public class PRACTICE{
//     public int removeDuplicate(int[] nums){
//         if(nums.length == 0) return 0;
//         int i =0;
//         for(int j =0; j<nums.length; j++){
//             if(nums[i] != nums[j]){
//                 i++;
//                 nums[i] = nums[j];

//             }
//         }
//         return i+1;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,2,2,3,4,5,5};
//         PRACTICE practice = new PRACTICE();
//           int k = practice.removeDuplicate(nums);
//         for(int i=0; i< k; i++){
//             System.out.print(nums[i] + " ");
//         }
//     }
// } 

//sort array by parity
// import java.util.*;
// public class PRACTICE{
//     public int[] sortbyParity(int[] nums){
//         int[] result = new int[nums.length];
//         int index = 0;

//         for(int i =0; i<nums.length; i++){
//             if(nums[i] % 2 == 0){
//                 result[index++] = nums[i];
//             }
//         }
//         for(int i =0; i<nums.length; i++){
//             if(nums[i] % 2 != 0){
//                 result[index++] = nums[i];
//             }
//         }
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,2,3,4,5,6,7,8};
//         PRACTICE practice = new PRACTICE();
//         int[] result = practice.sortbyParity(nums);       
//           System.out.println(Arrays.toString(result));
//     }
//  }

//backspace string compare
// import java.util.*;
// public class PRACTICE{
//     public boolean backSpaceCompare(String s, String t){
//         int i =s.length() - 1;
//         int j =t.length() - 1;

//         int skipS = 0;
//         int skipT = 0;

//         while(i >= 0 || j >= 0){
//             while(i >= 0){
//             if(s.charAt(i) == '#'){
//                 skipS++;
//                 i--;
//             }
//             else if(skipS > 0){
//                 skipS--;
//                 i--;
//             }else{
//                 break;
//             }
//         }

//         while(j >= 0){
//             if(t.charAt(j) == '#'){
//                 skipT++;
//                 j--;
//             }
//             else if(skipT > 0){
//                 skipT--;
//                 j--;
//             }
//             else{
//                 break;
//             }
//         }
//         if(i >= 0 && j>=0){
//             if(s.charAt(i) != t.charAt(j)){
//                 return false;
//             }
// //         }
//         // if(s.length() != t.length()) return false;
//         else if(i >= 0 || j>= 0){
//             return false;
//         }
//         i--;
//         j--;
//     }
//     return true;
//     }

//     public static void main(String[] args) {
//         String s = "ab#d";
//         String t = "ad#d";
//         PRACTICE practice = new PRACTICE();
//         System.out.println(practice.backSpaceCompare(s, t));
//     }
// }


//is palindrome
// import java.util.*;
// public class PRACTICE{
//     public boolean isPalindrome(int x){
//         if(x < 0) return false;
//         int original = x;
//         int reverse = 0;
//         while(x != 0){
//             int digit = x % 10;
//             reverse = reverse * 10 + digit;
//             x = x / 10;
//         }
//          if(original == reverse){
//             return true;
//          }
//          return false;
 
//     }
//     public static void main(String[] args) {
//         int x = 121;
//         PRACTICE obj = new PRACTICE();
//         System.out.print(obj.isPalindrome(x));
//     }
// }

//reverse integer
// import java.util.*;
// public class PRACTICE{
//     public int reverseinteger(int x){
//         int rev = 0;
//         while(x != 0){
//             int digit = x % 10;
//             if(rev > Integer.MAX_VALUE/ 10 || rev < Integer.MIN_VALUE/10){
//                 return 0;
//             }
//             rev = rev * 10 + digit;
//             x = x / 10;
//         }
//         return rev;
//     }
//     public static void main(String[] args) {
//         int x = -123;
//         PRACTICE obj = new PRACTICE();
//         int y = obj.reverseinteger(x);
//         System.out.println(y);
//     }
// }

//plus one
// import java.util.*;
// public class Plusone{
//  public static void main(String args[]){
//     System.out.println("Enter the number of digits in array");
//     Scanner sc = new Scanner(System.in);
//     int[] arr = new int[sc.nextInt()];
//     System.out.println("Enter the digits in array");
//     for(int i = 0 ;i < arr.length ; i++){
//         arr[i] = sc.nextInt();
//     }
//     Plusone obj = new Plusone();
//     int[] result = obj.Plusone(arr);
//     System.out.println("The result is : ");
//     for(int i = 0 ;i < result.length ; i++){
//         System.out.print(result[i] + " ");
//     }   
//  }
//  public int[] Plusone(int[] arr){
//     for(int i = arr.length - 1; i>= 0; i--){
//         if(arr[i] < 9){
//             arr[i] = arr[i] + 1;
//             return arr;
//         }
//         else{
//             arr[i] = 0;
//         }
//     }

//     int[] result = new int[arr.length + 1];
//     result[0] = 1;
//     return result;
//  }

// }

// reverse integer
// public class PRACTICE{
//     public int reverseinteger(int x){
//         int rev = 0;
//         while(x != 0){
//             int digit = x % 10;
//             if(rev > Integer.MAX_VALUE/ 10 || rev < Integer.MIN_VALUE/10){
//                 return 0;
//             }
//             rev = rev * 10 + digit;
//             x = x / 10;
//         }
//         return rev;
//     }
//     public static void main(String[] args) {
//         int x = -123;
//         PRACTICE obj = new PRACTICE();
//         int y = obj.reverseinteger(x);
//         System.out.println(y);
//     }
// }


// plus one
// import java.util.*;
// public class PRACTICE{
//  public static void main(String args[]){
//     System.out.println("Enter the number of digits in array");
//     Scanner sc = new Scanner(System.in);
//     int[] arr = new int[sc.nextInt()];
//     System.out.println("Enter the digits in array");
//     for(int i = 0 ;i < arr.length ; i++){
//         arr[i] = sc.nextInt();
//     }
//     PRACTICE obj = new PRACTICE();
//     int[] result = obj.Plusone(arr);
//     System.out.println("The result is : ");
//     for(int i = 0 ;i < result.length ; i++){
//         System.out.print(result[i] + " ");
//     }   
//  }
//  public int[] Plusone(int[] arr){
//     for(int i = arr.length - 1; i>= 0; i--){
//         if(arr[i] < 9){
//             arr[i] = arr[i] + 1;
//             return arr;
//         }
//         else{
//             arr[i] = 0;
//         }
//     }

//     int[] result = new int[arr.length + 1];
//     result[0] = 1;
//     return result;
//  }
//  }



//is valid anagram
// public class PRACTICE{
//     public static boolean isAnagram(String s, String t){
//         if(s.length() != t.length()) return false;
//         int[] count = new int[26];
//         for(char c : s.toCharArray()){
//             count[c - 'a']++;
//         }

//         for(char c : t.toCharArray()){
//             count[c - 'a']--;
//         }


//         for(int val : count){
//             if(val != 0)return false;

//             // return true;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "anagram";
//         String t = "nagaram";
//         System.out.print(isAnagram(s, t));
//     }
// }

//pivot index
// import java.util.*;
// public class PRACTICE{
//     public int pivotindex(int[] nums){
//         int totalSum = 0;
//         int leftSum = 0;
//         for(int i = 0; i<nums.length ; i++){
//             totalSum += nums[i];
//         }
//         for(int i =0; i<nums.length ; i++){
//             int rightSum = totalSum - nums[i] -leftSum;

//             if(leftSum == rightSum){
//                 return i;
//             }
//             leftSum += nums[i];
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         PRACTICE obj = new PRACTICE();
//         System.out.println("enter size of array");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] nums = new int[n];
//         System.out.println("enthr the elements of array");
//         for(int i = 0 ; i< n ;i++){
//             nums[i] = sc.nextInt();
//         }
//         int result = obj.pivotindex(nums);
//         System.out.print("pivot index is: " + result);

//     }
// }

//move zeroes
// import java.util.Arrays;
// public class PRACTICE{
//     public void moveZeroes(int[] nums){
//         int insert = 0;
//         for(int num : nums){
//             if(num != 0){
//                 nums[insert++] = num;
//             }
//         }
//         while(insert < nums.length){
//             nums[insert++] = 0;
//         }
//     }

//     public static void main(String[] args){
//         int[] nums = {0,1,0, 3, 0, 1,0,2};
//         PRACTICE practice = new PRACTICE();
//         practice.moveZeroes(nums);
//         System.out.println("After moving zeros: " + Arrays.toString(nums));
//     }
// }

//Sorted squares
// import java.util.*;
// public class PRACTICE{
//     public int[]sortedSquares(int[] nums){
//        for(int i = 0; i< nums.length; i++){
//         nums[i] = nums[i] * nums[i];
//        }
//        Arrays.sort(nums);
//        return nums;
//     }

//     public static void main(String[] args) {
//         int[] nums = {-4, -1, 0, 3, 10};
//         PRACTICE practice = new PRACTICE();
//         int[] result = practice.sortedSquares(nums);
//         System.out.println(Arrays.toString(result));
//     }
// }



//searchinsert
// public class PRACTICE{
//     public int searchInsert(int[] nums, int target){
//         int Low = 0;
//         int high = nums.length - 1;

//         while(Low <= high){
//             int mid = Low  + (high - Low)/2;
//             if(nums[mid] == target){
//                 return mid;
//             }
//             else if(nums[mid] < target){
//                 Low = mid + 1;
//             }
//             else{
//                 high = mid - 1;
//             }
//             }
//             return Low;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1,3,5,6};
//         int target = 5;
//         PRACTICE practice = new PRACTICE();
//         int result = practice.searchInsert(nums, target);
//         System.out.println("Target index: " + result);
//     }
// }


// import java.util.*;
// public class PRACTICE{
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int i = m - 1;
//         int j = n - 1;
//         int k = m + n - 1;

//         while (i >= 0 && j >= 0) {
//             if (nums1[i] > nums2[j]) {
//                 nums1[k] = nums1[i];
//                 i--;
//             } else {
//                 nums1[k] = nums2[j];
//                 j--;
//             }
//             k--;
//         }

//         while (j >= 0) {
//             nums1[k] = nums2[j];
//             j--;
//             k--;
//         }
//     }
//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 3, 0, 0, 0};
//         int m = 3;
//         int[] nums2 = {2, 5, 6};
//         int n = 3;

//         PRACTICE practice = new PRACTICE();
//         practice.merge(nums1, m, nums2, n);
//         System.out.println("Merged array: " + Arrays.toString(nums1));
//     }
// }


//intersection of two arrays
// import java.util.*;
// public class PRACTICE{
//     public int[] intersection(int[] nums1, int[] nums2){
//         Set<Integer> set1 = new HashSet<>();
//         for(int num : nums1){
//             set1.add(num);
//         }
//         Set<Integer> result = new HashSet<>();
//         for(int num : nums2){
//             if(set1.contains(num)){
//                 result.add(num);
//             }
//         }
//         int[] ans = new int[result.size()];
//         int index = 0;
//         for(int val : result){
//             ans[index++] = val;
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 2, 1};
//         int[] nums2 = {2, 2};
//         PRACTICE practice = new PRACTICE();
//         int[] result = practice.intersection(nums1, nums2);
//         System.out.println("Intersection: " + Arrays.toString(result));

//     }
// }

//Two Sum
// public class PRACTICE{
//     public int[] twoSum(int[] nums, int target){
//         int n =  nums.length;
//         for(int i = 0; i < n ; i++){
//             int remaining = target - nums[i];
//             int  j = i + 1;
//             while(j < n){
//                 if(nums[j] == remaining){
//                     return new int[]{i, j};
//                 }
//                 j++;
//             }
//         }
//             return new int[] {};
//     }
//     public static void main(String[] args) {
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         PRACTICE practice = new PRACTICE();
//         int[] result = practice.twoSum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }

// }

//longest common prefix
import java.util.*;
public class PRACTICE{
    public String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
                if(prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        PRACTICE practice = new PRACTICE();
        String result = practice.longestCommonPrefix(strs);
        System.out.println("Longest common prefix: " + result);
    }
}