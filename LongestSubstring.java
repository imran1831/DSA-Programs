import java.util.HashSet;
public class LongestSubstring {
    public static int subString(String s){
        HashSet<Character> hset=new HashSet<>();
        int left=0;
        int maxLen=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            while(hset.contains(c)){
                hset.remove(s.charAt(left));
                left++;
            }
            hset.add(c);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
        
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(subString(s));
    }
}
