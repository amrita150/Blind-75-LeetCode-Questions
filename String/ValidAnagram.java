import java.util.Arrays;
class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        //brute force approach
        //with time complexity O(N log N), and the space complexity is O(N).
        char[] charArr1 = s.toCharArray();
         char[] charArr2 = t.toCharArray();

         Arrays.sort(charArr1);
         Arrays.sort(charArr2);
         

         for(int i = 0 ; i<charArr1.length ; i++){
             if(charArr1.length!=charArr2.length||charArr1[i]!=charArr2[i] ){
                 return false;
             }
         }

         return true;
    }

     public static void main(String[] args) {
        String s1 = "listen";
        String t1 = "silent";
        System.out.println(isAnagram(s1,t1));
        
        String s2 = "a";
        String t2 = "ab";
        System.out.println(isAnagram(s2,t2));
     }

}