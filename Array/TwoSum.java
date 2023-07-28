import java.util.*;
class TwoSum{
//     public static boolean twoSum(int[] nums, int target) {
//             brute force approach
//             int n = nums.length;
//             for(int i = 0 ; i<n ; i++){
//                 for(int j = i+1; j<n ; j++){
//                     if(nums[i]+nums[j]==target){
//                         return true;
//                     }
//                 }
//             }
    
//             return false;
//         }

        //we can also do it using two pointer approach after sorting array
        // time complexity for this O(n)+O(n log n)
       
        public static String twoSum(int []book, int target){
            int n = book.length;
            int i = 0;
            int j = n-1;
            Arrays.sort(book);
            while(i<j){
                if(book[i]+book[j]==target){
                    return "YES";
                }
                else if(book[i]+book[j]<target){
                    i++;
                }
                else{
                    j--;
                }
            }
            return "NO";
        }
        
        //using hashing 
    
    
    public static void main(String[] args) {
        int arr[] = {31,6,5,4,3,1};
        int target = 7;

        System.out.println(twoSum(arr, target));

    }

}
       
